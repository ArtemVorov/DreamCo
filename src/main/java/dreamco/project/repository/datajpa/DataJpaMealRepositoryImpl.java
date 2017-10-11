package dreamco.project.repository.datajpa;

import dreamco.project.model.Desire;
import dreamco.project.repository.DesireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;


@Repository
public class DataJpaMealRepositoryImpl implements DesireRepository {

    @Autowired
    private CrudMealRepository crudRepository;

    @Override
    public Desire save(Desire Meal, int userId) {
        return null;
    }

    @Override
    public boolean delete(int id, int userId) {
        return false;
    }

    @Override
    public Desire get(int id, int userId) {
        return null;
    }

    @Override
    public List<Desire> getAll(int userId) {
        return null;
    }

    @Override
    public Collection<Desire> getBetween(String category, int userId) {
        return null;
    }
}
