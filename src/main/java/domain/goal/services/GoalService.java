package domain.goal.services;

import domain.goal.exception.GoalNotFoundException;
import domain.goal.model.Goal;

public interface GoalService {
    Goal create (Goal goal);
    void delete (Long id) throws GoalNotFoundException;
    Goal update (Goal goal) throws GoalNotFoundException;
    Goal findById (Long id) throws GoalNotFoundException;
    Goal findByTitle (String title) throws GoalNotFoundException;
    Goal calculatePercentage(Goal targetSavingsAmount, Goal amountSaved);
    Goal milestoneCalculation();
    Iterable<Goal> findAll();
}
