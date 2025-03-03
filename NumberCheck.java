import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        // Initialize an array 
        int[] numbers = new int[5];
        
        // Scanner object for taking user input
        Scanner scanner = new Scanner(System.in);
        
        // Take user input for each number
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        
        // Check each number and print appropriate message
        for (int number : numbers) {
            if (number > 0) {
                if (number % 2 == 0) {
                    System.out.println("The number " + number + " is positive and even.");
                } else {
                    System.out.println("The number " + number + " is positive and odd.");
                }
            } else if (number < 0) {
                System.out.println("The number " + number + " is negative.");
            } else {
                System.out.println("The number is zero.");
            }
        }
        
        // Compare the first and last elements of the array
        int firstElement = numbers[0];
        int lastElement = numbers[numbers.length - 1];
        
        if (firstElement == lastElement) {
            System.out.println("The first and last elements are equal.");
        } else if (firstElement > lastElement) {
            System.out.println("The first element is greater than the last element.");
        } else {
            System.out.println("The first element is less than the last element.");
        }
    }
}

