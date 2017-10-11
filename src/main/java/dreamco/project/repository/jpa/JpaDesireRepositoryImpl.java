package dreamco.project.repository.jpa;

import dreamco.project.model.Desire;
import dreamco.project.model.User;
import dreamco.project.repository.DesireRepository;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * User: temaprof
 * Date: 26.08.2016
 */

@Repository
@Transactional(readOnly = true)
public class JpaDesireRepositoryImpl implements DesireRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public Desire save(Desire desire, int userId) {
        if (desire.isNew() && get(desire.getId(), userId) == null) {
            return null;
        }
        desire.setUser(em.getReference(User.class, userId)); // lazy proxy - присваивается только userId
        if(desire.isNew()){
            em.persist(desire);
            return desire;
        } else {
            return em.merge(desire);
        }
    }

    @Override
    @Transactional
    public boolean delete(int id, int userId) {
        return em.createNamedQuery(Desire.DELETE)
                .setParameter("id", id)
                .setParameter("userId", userId)
                .executeUpdate() != 0;                 // ?
    }

    @Override
    public Desire get(int id, int userId) {
        List<Desire> desires = em.createNamedQuery(Desire.GET, Desire.class) // jpql с типизацией
                .setParameter("id", id)
                .setParameter("userId", userId)
                .getResultList();
        return DataAccessUtils.singleResult(desires);
    }

    @Override
    public List<Desire> getAll(int userId) {
        return em.createNamedQuery(Desire.ALL_SORTED, Desire.class)
                .setParameter("userId", userId)
                .getResultList();
    }

    @Override
    public List<Desire> getBetween(String category, int userId) {
        return em.createNamedQuery(Desire.GET_BETWEEN, Desire.class)
                .setParameter("userId", userId)
                .setParameter("categories", category)
                .getResultList();
    }
}