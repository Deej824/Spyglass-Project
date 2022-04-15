package domain.goal.services;

import domain.goal.exception.GoalNotFoundException;
import domain.goal.model.Goal;

public interface GoalService {
    Goal addGoal (Goal goal);
    void deleteGoal (Goal goal) throws GoalNotFoundException;
    Goal editGoal (Goal goal) throws GoalNotFoundException;
    Goal saveGoal (Goal goal);
    Iterable<Goal> getAllGoals(Long id);
}
