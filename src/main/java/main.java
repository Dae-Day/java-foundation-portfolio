import java.util.Scanner;

public class main {
    public static class StudentGradeCalculator {

        public static void main(String[] args) {
            double[] marks = getMarks();
            double average = calculateAverage(marks);
            char grade = determineGrade(average);
            printReport(average, grade);
        }

        private static double[] getMarks() {
            Scanner input = new Scanner(System.in);
            int subjectCount = 0;

            while (true) {
                System.out.print("Enter number of subjects: ");
                if (input.hasNextInt()) {
                    subjectCount = input.nextInt();
                    if (subjectCount > 0) break;
                    else System.out.println("Number must be greater than 0.");
                } else {
                    System.out.println("Invalid input! Enter a number.");
                    input.next(); // clear invalid input
                }
            }

            double[] marks = new double[subjectCount];

            for (int i = 0; i < subjectCount; i++) {
                while (true) {
                    System.out.print("Enter mark for subject " + (i + 1) + ": ");
                    if (input.hasNextDouble()) {
                        double mark = input.nextDouble();
                        if (mark >= 0 && mark <= 100) {
                            marks[i] = mark;
                            break; // valid mark, exit while-loop
                        } else {
                            System.out.println("Mark must be between 0 and 100.");
                        }
                    } else {
                        System.out.println("Invalid input! Enter a number.");
                        input.next(); // clear invalid input
                    }
                }
            }

            return marks;
        }



        private static double calculateAverage(double[] marks) {
            double total = 0;
            for (double mark : marks) {
                total += mark;
            }
            return total / marks.length;
        }

        private static char determineGrade(double average) {
            if (average >= 75) return 'A';
            else if (average >= 65) return 'B';
            else if (average >= 55) return 'C';
            else if (average >= 45) return 'D';
            else return 'F';
        }

        private static void printReport(double average, char grade) {
            System.out.println("\n--- Report ---");
            System.out.println("Average: " + average);
            System.out.println("Grade: " + grade);
        }
    }
}
