package com.spyglass.optionalintelligence;

import domain.goal.exception.GoalNotFoundException;
import domain.goal.model.Goal;
import domain.goal.model.goalType;
import domain.goal.repo.GoalRepo;
import domain.goal.services.GoalService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Optional;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class GoalServiceImplTest {


        @MockBean
        private GoalRepo goalRepo;

        @Autowired
        private GoalService goalService;

        private Goal input;
        private Goal output;

        @BeforeEach
        public void setUp() throws ParseException {
            SimpleDateFormat dateOfBirth01 = new SimpleDateFormat("MM/DD/YYY");

            input = new Goal("Going to Hawaii", 3000.00,520.00,dateOfBirth01.parse("07/04/2022"),"notes", 17.0, goalType.VACATION_GOAL );
            output = new Goal("Going to Hawaii", 3000.00,520.00,dateOfBirth01.parse("07/04/2022"),"notes", 17.0, goalType.VACATION_GOAL );
            output.setId(1l);
            output.setTitle("Going to Hawaii");
        }


        @Test
        @DisplayName("Find goal  by title - success")
        public void findByTitleTest01() throws GoalNotFoundException {

            BDDMockito.doReturn(Optional.of(input)).when(goalRepo).findByTitle("Going to Hawaii");
            Goal foundGoal = goalService.findByTitle("Going to Hawaii");
            Assertions.assertEquals(input.toString(),foundGoal.toString());
    }


        @Test
        @DisplayName("Find goal by Id - success")
        public void findByIdTest01() throws GoalNotFoundException {

            BDDMockito.doReturn(Optional.of(output)).when(goalRepo).findById(1l);
            Goal foundGoal = goalService.findById(1l);
            Assertions.assertEquals(output.toString(),foundGoal.toString());
    }

    }
