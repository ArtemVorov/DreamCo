package dreamco.project.repository;
import dreamco.project.model.User;

import java.util.List;

/**
 * User: temaprof
 * Date: 19.09.2016
 */
public interface UserRepository {
    User save(User user);

    // false if not found
    boolean delete(int id);

    // null if not found
    User get(int id);

    // null if not found
    User getByEmail(String email);

    List<User> getAll();
}
