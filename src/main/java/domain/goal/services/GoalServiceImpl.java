package domain.goal.services;

import domain.goal.exception.GoalNotFoundException;
import domain.goal.model.Goal;
import domain.goal.repo.GoalRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GoalServiceImpl implements GoalService {

    private static final Logger logger = LoggerFactory.getLogger(GoalServiceImpl.class);
    private GoalRepo goalRepo;

    @Autowired
    public GoalServiceImpl(GoalRepo goalRepo) {
        this.goalRepo = goalRepo;
    }

    @Override
    public Goal addGoal(Goal goal) {
        return null;
    }

    @Override //are we deleting goal by ID?
    public void deleteGoal(Goal goal) throws GoalNotFoundException {
        Optional<Goal> GoalExistOption = goalRepo.findById(id);
        if (GoalExistOption.isEmpty())
            throw new GoalNotFoundException("No goal with that id");
        Goal goal = GoalExistOption.get();
        goalRepo.delete(goal);

    }

    @Override
    public Goal editGoal(Goal goal) throws GoalNotFoundException {
        return null;
    }

    @Override
    public Goal saveGoal(Goal goal) {
        return null;
    }

    @Override
    public Iterable<Goal> getAllGoals(Long id) {
        return null;
    }

    private Double calculatePercentage(Double targetSavingsAmount, Double amountSaved) {

        return targetSavingsAmount;
    }
}


