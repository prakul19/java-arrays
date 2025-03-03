import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        // Check if the number is a positive integer
        if (number <= 0) {
            System.err.println("Error: The number is not a positive integer.");
            return;
        }

        // Create a String array
        String[] results = new String[number + 1];

        // Loop from 0 to the number
        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                results[i] = "Fizz";
            } else if (i % 5 == 0) {
                results[i] = "Buzz";
            } else {
                results[i] = Integer.toString(i);
            }
        }

	// Loop for printing the result
        for (int i = 0; i <= number; i++) {
            System.out.println("Position " + i + "=" + results[i]);
        }
    }
}

