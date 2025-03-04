import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input of number of persons
        System.out.println("Enter the number of persons: ");
        int numPersons = sc.nextInt();

        // Create arrays to store the data
        double[] weights = new double[numPersons];
        double[] heights = new double[numPersons];
        double[] bmi = new double[numPersons];
        String[] weightStatus = new String[numPersons];

        // Take user input
        for (int i = 0; i < numPersons; i++) {
            System.out.println("Enter the weight (in kg) of person " + (i + 1) + ": ");
            weights[i] = sc.nextDouble();
            System.out.println("Enter the height (in meters) of person " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
        }

        // Calculate the BMI 
        for (int i = 0; i < numPersons; i++) {
            bmi[i] = weights[i] / (heights[i] * heights[i]);

            // Determine weight status based on BMI value
            if (bmi[i] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi[i] >= 18.5 && bmi[i] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi[i] >= 25 && bmi[i] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display the result
        System.out.println("\nDetails of each person:");
        for (int i = 0; i < numPersons; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("Height: " + heights[i] + " meters");
            System.out.println("Weight: " + weights[i] + " kg");
            System.out.println("BMI: " + bmi[i]);
            System.out.println("Weight Status: " + weightStatus[i]);
            System.out.println();
        }
    }
}

