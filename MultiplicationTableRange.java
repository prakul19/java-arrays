import java.util.Scanner;

public class MultiplicationTableRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get the integer input from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Initialize an array 
        int[] multiplicationResult = new int[4];
        
        // Loop to find the multiplication table from 6 to 9
        for (int i = 0; i < 4; i++) {
            multiplicationResult[i] = number * (i + 6);
        }
        
        // Display the multiplication table results
        for (int i = 0; i < 4; i++) {
            System.out.println(number + " * " + (i + 6) + " = " + multiplicationResult[i]);
        }
    }
}

