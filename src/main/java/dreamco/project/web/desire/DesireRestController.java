package dreamco.project.web.desire;

import dreamco.project.AuthorizedUser;
import dreamco.project.model.Desire;
import dreamco.project.service.DesireService;
import dreamco.project.util.DesireUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * User: temaprof
 * Date: 19.09.2016
 */
@Controller
public class DesireRestController { // Работает с авторизированными пользователями
    private static final Logger LOG = LoggerFactory.getLogger(DesireRestController.class);

    @Autowired
    private DesireService service; // Подключает слой сервис

    public Desire get(int id) {
        int userId = AuthorizedUser.id();
        LOG.info("get desire {} for User {}", id, userId);
        return service.get(id, userId);
    }

    public void delete(int id) {
        int userId = AuthorizedUser.id();
        LOG.info("delete desire {} for User {}", id, userId);
        service.delete(id, userId);
    }

    public List<Desire> getAll() {
        int userId = AuthorizedUser.id();
        LOG.info("getAll for User {}", userId);
        return DesireUtil.getBARTERwithCollections(service.getAll(userId), AuthorizedUser.getBarterPerReg());
    }

    public void update(Desire desire, int id) {
        desire.setId(id);
        int userId = AuthorizedUser.id();
        LOG.info("update {} for User {}", desire, userId);
        service.update(desire, userId);
    }

    public Desire create(Desire desire) {
        desire.setId(null);
        int userId = AuthorizedUser.id();
        LOG.info("create {} for User {}", desire, userId);
        return service.save(desire, userId);
    }

    public List<Desire> getCategory(String category) {
        int userId = AuthorizedUser.id();
        LOG.info("getBetween {} for User {}", category, userId);

        return DesireUtil.getFilteredWithCategory(
                service.getBetweenDates(category, userId), category);
    }
}
