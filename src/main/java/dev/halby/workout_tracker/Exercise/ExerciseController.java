package dev.halby.workout_tracker.Exercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class ExerciseController {
    @Autowired
    ExerciseService exerciseService;

    @GetMapping("/v1/exercises")
    public ResponseEntity<List<Exercise>> getAllExercises() {
        return new ResponseEntity<>(exerciseService.getAllExercieses(), HttpStatus.ACCEPTED);
    }
}
