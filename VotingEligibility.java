import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        // Initialize an array 
        int[] studentAges = new int[10];
        
        Scanner scanner = new Scanner(System.in);
        
        // Take user input for the age of each student
        for (int i = 0; i < studentAges.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            studentAges[i] = scanner.nextInt();
        }
        
        // Check voting eligibility for each student
        for (int age : studentAges) {
            if (age < 0) {
                System.err.println("Invalid age: " + age);
            } else if (age >= 18) {
                System.out.println("The student with the age " + age + " can vote.");
            } else {
                System.out.println("The student with the age " + age + " cannot vote.");
            }
        }
    }
}

