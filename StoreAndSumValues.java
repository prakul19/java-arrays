import java.util.Scanner;

public class StoreAndSumValues {
    public static void main(String[] args) {
        // Initialise array
        double[] values = new double[10];
        double total = 0.0;
        int index = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        // Infinite while loop
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double num = scanner.nextDouble();
            
            // Check if the input is 0 or negative, or if the array is full
            if (num <= 0 || index == 10) {
                break;
            }
            
            // Store the number in the array
            values[index] = num;
            // Increment the index
            index++;
        }
        
        // Calculate the total sum of the values
        for (int i = 0; i < index; i++) {
            total += values[i];
        }
        
        // Display the numbers and the total sum
        System.out.print("You entered: ");
        for (int i = 0; i < index; i++) {
            System.out.print(values[i] + " ");
        }
	System.out.println("\nThe total sum of the numbers is: " + total); 
        }
}

