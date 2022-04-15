package domain.goal.repo;

import domain.goal.model.Goal;
import domain.user.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface GoalRepo extends CrudRepository <Goal, Long> {
    Optional<Goal> findByTitle(String title);

}
