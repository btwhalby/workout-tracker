package dev.halby.workout_tracker.Exercise;

import org.springframework.boot.autoconfigure.flyway.FlywayProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface ExerciseRepository extends JpaRepository<Exercise, Integer> {
}
