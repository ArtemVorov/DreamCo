package dreamco.project.repository.datajpa;

import dreamco.project.model.Desire;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CrudMealRepository extends JpaRepository<Desire, Integer> {
}
