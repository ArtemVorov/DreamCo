package dreamco.project.web.user;



import dreamco.project.model.User;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * User: temaprof
 * Date: 19.09.2016
 */
@Controller
public class AdminRestController extends AbstractUserController {

    public List<User> getAll() {
        return super.getAll();
    }

    public User get(int id) {
        return super.get(id);
    }

    public User create(User user) {
        return super.create(user);
    }

    public void delete(int id) {
        super.delete(id);
    }

    public void update(User user, int id) {
        super.update(user, id);
    }

    public User getByMail(String email) {
        return super.getByMail(email);
    }
}
