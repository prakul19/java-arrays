import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input 
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        int temp = number;
        int count = 0;
        while (temp != 0) {
            temp /= 10;
            count++;
        }

        // Initialise an array
        int[] digits = new int[count];

        // Extract digits from the number 
        for (int i = 0; i < count; i++) {
            digits[i] = number % 10;
            number /= 10;
        }

        // Display the elements in reverse order
        System.out.print("The number in reverse order is: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }
        System.out.println();
    }
}

