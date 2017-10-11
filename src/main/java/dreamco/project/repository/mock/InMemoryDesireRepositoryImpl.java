package dreamco.project.repository.mock;

import dreamco.project.model.Categories;
import dreamco.project.model.Desire;
import dreamco.project.repository.DesireRepository;
import dreamco.project.util.CategoriesUtil;
import dreamco.project.util.DesireUtil;
import org.springframework.stereotype.Repository;


import java.time.LocalDateTime;
import java.time.Month;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

import static dreamco.project.repository.mock.InMemoryUserRepositoryImpl.ADMIN_ID;
import static dreamco.project.repository.mock.InMemoryUserRepositoryImpl.USER_ID;

/**
 * Created by temaprof on 25.09.2016.
 */
@Repository
public class InMemoryDesireRepositoryImpl implements DesireRepository {
    private static final Comparator<Desire> DESIRE_COMPARATOR = Comparator.comparing(Desire::getDateTime).reversed();

    // Map  userId -> (mealId-> desire)
    private Map<Integer, Map<Integer, Desire>> repository = new ConcurrentHashMap<>();
    private AtomicInteger counter = new AtomicInteger(0);

    {
       // DesireUtil.BARTER.forEach(um -> save(um, USER_ID));

        save(new Desire(LocalDateTime.of(2016, Month.JUNE, 1, 14, 0), "Админ desire", "Barter", Categories.DESIRE), ADMIN_ID);
        save(new Desire(LocalDateTime.of(2016, Month.JUNE, 1, 21, 0), "Админ desire", "Barter", Categories.JOB), ADMIN_ID);
    }


    @Override
    public Desire save(Desire desire, int userId) {
        Objects.requireNonNull(desire);

        Integer desireId = desire.getId();
        if (desire.isNew()) {
            desireId = counter.incrementAndGet();
            desire.setId(desireId);
        } else if (get(desireId, userId) == null) {
            return null;
        }
        Map<Integer, Desire> desires = repository.computeIfAbsent(userId, ConcurrentHashMap::new);
        desires.put(desireId, desire);
        return desire;
    }

    @Override
    public boolean delete(int id, int userId) {
        Map<Integer, Desire> desires = repository.get(userId);
        return desires != null && desires.remove(id) != null;
    }

    @Override
    public Desire get(int id, int userId) {
        Map<Integer, Desire> desires = repository.get(userId);
        return desires == null ? null : desires.get(id);
    }

    @Override
    public List<Desire> getAll(int userId) {
        Map<Integer, Desire> desires = repository.get(userId);
        return desires == null ?
                Collections.emptyList() :
                desires.values().stream().sorted(DESIRE_COMPARATOR).collect(Collectors.toList());
    }

    @Override
    public Collection<Desire> getBetween(String category, int userId) {
        Objects.requireNonNull(category);
        CategoriesUtil.categoryInitialize(getAll(userId));
        return CategoriesUtil.getCategory(category);
    }
}
