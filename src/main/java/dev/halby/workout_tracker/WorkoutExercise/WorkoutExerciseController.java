package dev.halby.workout_tracker.WorkoutExercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WorkoutExerciseController {
    @Autowired
    WorkoutExerciseService workoutExerciseService;

    @GetMapping("/api/v1/workoutexercises")
    public List<WorkoutExercise> getAllWorkoutExercises() {
        return workoutExerciseService.getAllWorkoutExercises();
    }
}
