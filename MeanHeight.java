import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a double array
        double[] heights = new double[11];
        double sum = 0;

        // Get input values from the user and calculate the sum
        System.out.println("Enter the heights of 11 football players:");
        for (int i = 0; i < 11; i++) {
            heights[i] = scanner.nextDouble();
            sum += heights[i];
        }

        // Calculate the mean height
        double meanHeight = sum / 11;

        // Print the mean height of the football team
        System.out.printf("The mean height of the football team is: %.2f\n", meanHeight);
    }
}

