package dreamco.project.service;

import dreamco.project.model.User;
import dreamco.project.util.exception.NotFoundException;

import java.util.List;

/**
 * User: temaprof
 * Date: 19.09.2016
 */
public interface UserService {

    User save(User user);

    void delete(int id) throws NotFoundException;

    User get(int id) throws NotFoundException;

    User getByEmail(String email) throws NotFoundException;

    List<User> getAll();

    void update(User user);
}
