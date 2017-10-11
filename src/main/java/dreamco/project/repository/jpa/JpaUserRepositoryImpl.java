package dreamco.project.repository.jpa;

import dreamco.project.model.User;
import dreamco.project.repository.UserRepository;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Repository
@Transactional(readOnly = true) // на любое изменение в бд EntityManager нужна транзакция
public class JpaUserRepositoryImpl implements UserRepository {

/*
    @Autowired
    private SessionFactory sessionFactory;

    private Session openSession() {
        return sessionFactory.getCurrentSession();
    }
*/

    @PersistenceContext
    private EntityManager em; // заменяет sessionFactory в Hibernate

    @Override
    @Transactional
    public User save(User user) {
        if (user.isNew()) {
            em.persist(user); // persist - сохраняем новую entity
            return user;
        } else {
            return em.merge(user); // merge - объединяется с тем, что уже есть внутри
        }
    }

    @Override
    public User get(int id) {
        return em.find(User.class, id);
    }

    @Override
    @Transactional
    public boolean delete(int id) {

/*      User ref = em.getReference(User.class, id); // getReference - достает ссылку на объект
        em.remove(ref);
*/

//        Query query = em.createQuery("DELETE FROM User u WHERE u.id=:id"); // HQL (JPQL)
//        return query.setParameter("id", id).executeUpdate() != 0;

        return em.createNamedQuery(User.DELETE).setParameter("id", id).executeUpdate() != 0;
    }

    @Override
    public User getByEmail(String email) {
        List<User> users = em.createNamedQuery(User.BY_EMAIL, User.class).setParameter(1, email).getResultList();
        return DataAccessUtils.singleResult(users);
    }

    @Override
    public List<User> getAll() {
        return em.createNamedQuery(User.ALL_SORTED, User.class).getResultList();
    }
}
