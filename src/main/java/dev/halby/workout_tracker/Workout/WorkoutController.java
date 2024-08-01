package dev.halby.workout_tracker.Workout;

import dev.halby.workout_tracker.WorkoutExercise.WorkoutExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WorkoutController {
    @Autowired
    WorkoutService workoutService;
    @GetMapping("/v1/workouts")
    public ResponseEntity<List<Workout>> getAllWorkouts() {
        return new ResponseEntity<>(workoutService.getAllWorkouts(), HttpStatus.ACCEPTED);
    }
}
