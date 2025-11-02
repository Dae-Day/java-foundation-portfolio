# Student Grade Calculator

A simple Java console application that calculates a student's average grade based on marks entered for multiple subjects.

## Overview

This project allows users to input marks for a chosen number of subjects, calculates the average score, and determines the corresponding grade using a standard grading scale:

| Average Score | Grade |
|---------------|-------|
| 75 – 100      | A     |
| 65 – 74       | B     |
| 55 – 64       | C     |
| 45 – 54       | D     |
| 0 – 44        | F     |

The program validates inputs to ensure that only numbers between 0 and 100 are accepted.

## Tech Used

- Java 21 (OpenJDK)
- IntelliJ IDEA Ultimate
- Maven (for project management)
- Git & GitHub (version control)

## Features

- Input validation for both number of subjects and marks.
- Dynamic array creation based on the number of subjects entered.
- Calculation of average and assignment of grade.
- Clean console output displaying results.

## How to Run

1. Clone the repository:  
   ```bash
   git clone git@github.com:Dae-Day/java-foundation-portfolio.git

2. Navigate to the project folder:
cd java-foundation-portfolio/studentGradeCalculator

3. Open the project in IntelliJ IDEA.
   
Run the main.java class.

Sample Output

Enter number of subjects: 3

Enter mark for subject 1: 80

Enter mark for subject 2: 70

Enter mark for subject 3: 60

--- Report ---

Average: 70.0

Grade: B

## What I Learned

- Handling user input with Scanner.
- Implementing input validation and loops.
- Using arrays to store and process multiple values.
- Writing modular code with methods for clarity and reusability.
- Basic Git workflow and project structure.
