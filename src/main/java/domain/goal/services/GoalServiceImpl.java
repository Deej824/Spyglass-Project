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
    public Goal create(Goal goal) {
        return goalRepo.save(goal);
    }


    @Override
    public Goal update(Goal goal) throws GoalNotFoundException {
        Long id = goal.getId();
        Optional <Goal> goalExistOption = goalRepo.findById(id);
        if (goalExistOption.isEmpty())
            throw new GoalNotFoundException("Goal not found");
        return goalRepo.save(goal);
    }

    @Override
    public Goal findById(Long id) throws GoalNotFoundException {
        Optional<Goal> goalOptional = goalRepo.findById(id);
        if (goalOptional.isEmpty())
            throw new GoalNotFoundException ("Goal not found");
        return goalOptional.get();
    }

    @Override
    public Goal findByTitle(String title) throws GoalNotFoundException {
        Optional<Goal> goalOptional = goalRepo.findByTitle("Going to Hawaii");
        if (goalOptional.isEmpty())
            throw new GoalNotFoundException ("Goal not found");
        return goalOptional.get();
    }


    @Override
    public Iterable<Goal> findAll() {
        return goalRepo.findAll();
    }

    @Override
    public void delete(Long id) throws GoalNotFoundException {
        Optional<Goal> goalOptional = goalRepo.findById(id);
        if(goalOptional.isEmpty())
            throw new GoalNotFoundException("Goal not found");
        Goal goalToRemove = goalOptional.get();
        goalRepo.delete(goalToRemove);

    }

    @Override
    public Goal calculatePercentage(Goal targetSavingsAmount, Goal amountSaved) {
        return null;
    }

    @Override
    public Goal milestoneCalculation() {
        return null;
    }
}




