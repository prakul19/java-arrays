import java.util.Scanner;

public class LargestDigitsIncreased {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input 
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        // Define initial size 
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Extract digits from the number
        while (number != 0) {
            if (index == maxDigit) {
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                System.arraycopy(digits, 0, temp, 0, digits.length);
                digits = temp;
            }

            digits[index] = number % 10;
            number /= 10;
            index++;
        }

        // Variables to store digits
        int largest = 0;
        int secondLargest = 0;

        // Find the largest and second largest digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display the largest and second largest digits
        System.out.println("The largest digit is: " + largest);
        System.out.println("The second largest digit is: " + secondLargest);
    }
}

