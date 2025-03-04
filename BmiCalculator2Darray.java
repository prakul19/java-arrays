import java.util.Scanner;

public class BmiCalculator2Darray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.println("Enter the number of persons: ");
        int numPersons = sc.nextInt();

        // Create a multi-dimensional array 
        double[][] personData = new double[numPersons][3];
        // Create an array 
        String[] weightStatus = new String[numPersons];

        // Take user input of each person
        for (int i = 0; i < numPersons; i++) {
            System.out.println("Enter the weight (in kg) of person " + (i + 1) + ": ");
            double weight = sc.nextDouble();
            while (weight <= 0) {
                System.out.println("Weight must be positive. Please re-enter the weight (in kg) of person " + (i + 1) + ": ");
                weight = sc.nextDouble();
            }
            System.out.println("Enter the height (in meters) of person " + (i + 1) + ": ");
            double height = sc.nextDouble();
            while (height <= 0) {
                System.out.println("Height must be positive. Please re-enter the height (in meters) of person " + (i + 1) + ": ");
                height = sc.nextDouble();
            }

            personData[i][0] = weight;
            personData[i][1] = height;
            personData[i][2] = weight / (height * height); 
        }

        // weight status regarding BMI
        for (int i = 0; i < numPersons; i++) {
            double bmi = personData[i][2];
            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi >= 25 && bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display the results
        System.out.println("\nDetails of each person:");
        for (int i = 0; i < numPersons; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("Height: " + personData[i][1] + " meters");
            System.out.println("Weight: " + personData[i][0] + " kg");
            System.out.println("BMI: " + personData[i][2]);
            System.out.println("Weight Status: " + weightStatus[i]);
            System.out.println();
        }
    }
}

