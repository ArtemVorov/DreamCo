package dreamco.project.service;


import dreamco.project.model.Desire;
import dreamco.project.repository.DesireRepository;
import dreamco.project.util.exception.ExceptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

/**
 * User: temaprof
 * Date: 19.09.2016
 */
@Service
public class DesireServiceImpl implements DesireService { // Отлавливает исключения в методах

    @Autowired
    private DesireRepository repository; // Подключает DAO

    @Override
    public Desire get(int id, int userId) {
        return ExceptionUtil.checkNotFoundWithId(repository.get(id, userId), id);
    }

    @Override
    public void delete(int id, int userId) {
        ExceptionUtil.checkNotFoundWithId(repository.delete(id, userId), id);
    }


    @Override
    public List<Desire> getAll(int userId) {
        return repository.getAll(userId);
    }

    @Override
    public Collection<Desire> getBetweenDateTimes(String category, int userId) {
        return repository.getBetween(category, userId);
    }

    @Override
    public Desire update(Desire desire, int userId) {
        return ExceptionUtil.checkNotFoundWithId(repository.save(desire, userId), desire.getId());
    }

    @Override
    public Desire save(Desire desire, int userId) {
        return repository.save(desire, userId);
    }
}
