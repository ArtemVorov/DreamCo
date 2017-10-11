package dreamco.project.repository;

import dreamco.project.model.Desire;

import java.util.Collection;
import java.util.List;

/**
 * Created by temaprof on 25.09.2016.
 */
public interface DesireRepository {
    // null if updated meal do not belong to userId
    Desire save(Desire Desire, int userId);

    // false if meal do not belong to userId
    boolean delete(int id, int userId);

    // null if meal do not belong to userId
    Desire get(int id, int userId);

    // ORDERED dateTime
    List<Desire> getAll(int userId);

    Collection<Desire> getBetween(String category, int userId);
}
