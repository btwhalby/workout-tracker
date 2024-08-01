-- Löschen der Tabellen in der richtigen Reihenfolge
DROP TABLE IF EXISTS sets;
DROP TABLE IF EXISTS workout_exercise;
DROP TABLE IF EXISTS workout;
DROP TABLE IF EXISTS exercise;


CREATE TABLE exercise
(
    exercise_id SERIAL PRIMARY KEY,
    name        VARCHAR(255) NOT NULL,
    category    VARCHAR(255) NOT NULL
);
CREATE TABLE workout
(
    workout_id   SERIAL PRIMARY KEY,
    workout_date DATE NOT NULL,
    description VARCHAR(255)
);
CREATE TABLE workout_exercise
(
    workout_exercise_id SERIAL PRIMARY KEY,
    workout_id          INT REFERENCES workout (workout_id) ON DELETE CASCADE,
    exercise_id         INT REFERENCES exercise (exercise_id) ON DELETE CASCADE,
    exercise_order      INT,
    created_at          TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
CREATE TABLE sets
(
    set_id              SERIAL PRIMARY KEY,
    workout_exercise_id INT REFERENCES workout_exercise (workout_exercise_id) ON DELETE CASCADE,
    set_number          INT NOT NULL,
    repetitions         INT NOT NULL,
    weight              NUMERIC(5, 2)
);

INSERT INTO exercise (name, category)
VALUES ('Bench Press', 'Chest'),
       ('Deadlift', 'Back'),
       ('Squat', 'Legs'),
       ('Bicep Curl', 'Arms'),
       ('Tricep Dip', 'Arms'),
       ('Shoulder Press', 'Shoulders'),
       ('Plank', 'Core'),
       ('Lunges', 'Legs'),
       ('Leg Press', 'Legs'),
       ('Hamstring Curl', 'Legs'),
       ('Calf Raise', 'Legs'),
       ('Crunches', 'Core');

INSERT INTO workout (workout_date, description)
VALUES ('2024-08-01', 'Strength training session focused on upper body.'),
       ('2024-08-02', 'Leg day workout.');

INSERT INTO workout_exercise (workout_id, exercise_id, exercise_order)
VALUES (1, 1, 1), -- Bench Press in the first workout
       (1, 4, 2), -- Bicep Curl in the first workout
       (2, 3, 1), -- Squat in the second workout
       (2, 9, 2); -- Leg Press in the second workout

INSERT INTO sets (workout_exercise_id, set_number, repetitions, weight)
VALUES (1, 1, 10, 80.0), -- First set of Bench Press
       (1, 2, 8, 85.0),  -- Second set of Bench Press
       (2, 1, 12, 20.0), -- First set of Bicep Curl
       (3, 1, 8, 100.0), -- First set of Squat
       (3, 2, 6, 110.0), -- Second set of Squat
       (4, 1, 10, 150.0); -- First set of Leg Press
