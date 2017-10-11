package dreamco.project.web.repository.mock;

import dreamco.project.model.Desire;
import dreamco.project.repository.DesireRepository;
import org.springframework.stereotype.Repository;


import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@Repository
public class InMemoryDesireRepositoryImpl implements DesireRepository {

    private static final Comparator<Desire> MEAL_COMPARATOR = Comparator.comparing(Desire::getDateTime).reversed();

    // Map  userId -> (mealId-> meal)
    private Map<Integer, Map<Integer, Desire>> repository = new ConcurrentHashMap<>();
    private AtomicInteger counter = new AtomicInteger(0);

    @Override
    public Desire save(Desire meal, int userId) {
        Integer mealId = meal.getId();
        if (meal.isNew()) {
            mealId = counter.incrementAndGet();
            meal.setId(mealId);
        } else if (get(mealId, userId) == null) {
            return null;
        }
        Map<Integer, Desire> meals = repository.computeIfAbsent(userId, ConcurrentHashMap::new);
        meals.put(mealId, meal);
        return meal;
    }

    @Override
    public boolean delete(int id, int userId) {
        Map<Integer, Desire> meals = repository.get(userId);
        return meals != null && meals.remove(id) != null;
    }

    @Override
    public Desire get(int id, int userId) {
        Map<Integer, Desire> meals = repository.get(userId);
        return meals == null ? null : meals.get(id);
    }

    @Override
    public List<Desire> getAll(int userId) {
        return getAllStream(userId).collect(Collectors.toList());
    }

    @Override
    public Collection<Desire> getBetween(String category, int userId) {
        return new ArrayList<>();
//        return getAllStream(userId)
//                .filter(um -> TimeUtil.isBetween(um.getDateTime(), startDateTime, endDateTime))
//                .collect(Collectors.toList());
    }

    private Stream<Desire> getAllStream(int userId) {
        Map<Integer, Desire> meals = repository.get(userId);
        return meals == null ?
                Stream.empty() : meals.values().stream().sorted(MEAL_COMPARATOR);
    }
}

