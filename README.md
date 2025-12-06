# Quiz_Game (Java)
This is a simple Java console-based Quiz Application that presents multiple-choice questions to the user, takes input, checks the answers, and calculates the final score. It demonstrates basic Java concepts such as classes & objects, arrays, loops, and user input handling.

# Features
-Displays questions with multiple-choice options (a/b/c).
-Accepts user input using Scanner.
-Validates user answers.
-Shows whether the answer is correct or wrong.
-Displays the correct answer when user is wrong.
-Calculates and prints the final score.

# Project Structure
├── Main.java        # Contains the main quiz logic
└── Questions.java   # Question model with methods for display & validation

# How It Works
1) The quiz questions are stored as an array of Questions objects.
2) Each question contains:
    ->Question text
    ->Options
    ->Correct answer
3) The user is prompted to enter a, b, or c.
4) The program checks the answer and updates the score.
5) After all questions, the total score is displayed.

# Run the Program
Make sure you have Java installed, then compile and run:
>>>javac Main.java
>>> java Main
