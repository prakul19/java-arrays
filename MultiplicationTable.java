import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get the integer input from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Initialize an array 
        int[] table = new int[10];
        
        // Run a loop from 1 to 10 to calculate the multiplication table
        for (int i = 0; i < 10; i++) {
            table[i] = number * (i + 1);
        }
        
        // Display the multiplication table results
        for (int i = 0; i < 10; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + table[i]);
        }
    }
}

