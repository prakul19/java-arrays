import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.println("Enter the number of students: ");
        int numStudents = sc.nextInt();

        // Create arrays
        double[][] marks = new double[numStudents][3];
        double[] percentages = new double[numStudents];
        String[] grades = new String[numStudents];

        // Take input for marks 
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            
            for (int j = 0; j < 3; j++) {
                String subject;
                if (j == 0) subject = "Physics";
                else if (j == 1) subject = "Chemistry";
                else subject = "Maths";
                
                System.out.println(subject + ": ");
                double mark = sc.nextDouble();
                while (mark < 0) {
                    System.out.println(subject + " marks must be positive. Please re-enter: ");
                    mark = sc.nextDouble();
                }
                marks[i][j] = mark;
            }
        }

        // Calculate the grades
        for (int i = 0; i < numStudents; i++) {
            double totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = (totalMarks / 300) * 100;

            if (percentages[i] >= 80) {
                grades[i] = "A - Level 4, Above agency-normalized standards";
            } else if (percentages[i] >= 70) {
                grades[i] = "B - Level 3, At agency-normalized standards";
            } else if (percentages[i] >= 60) {
                grades[i] = "C - Level 2, Below, but approaching agency-normalized standards";
            } else if (percentages[i] >= 50) {
                grades[i] = "D - Level 1, Well below agency-normalized standards";
            } else if (percentages[i] >= 40) {
                grades[i] = "E - Level 1, Too below agency-normalized standards";
            } else {
                grades[i] = "R - Remedial standards";
            }
        }

        // Display the results
        System.out.println("\nDetails of each student:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Physics: " + marks[i][0]);
            System.out.println("Chemistry: " + marks[i][1]);
            System.out.println("Maths: " + marks[i][2]);
            System.out.println("Percentage: " + percentages[i]);
            System.out.println("Grade: " + grades[i]);
            System.out.println();
        }
    }
}

