package dev.halby.workout_tracker.Exercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ExerciseController {
    @Autowired
    ExerciseService exerciseService;

    @GetMapping("/api/v1/exercises")
    public List<Exercise> getAllExercises() {
        return exerciseService.getAllExercieses();
    }
}
