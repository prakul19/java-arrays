import java.util.Scanner;

public class YoungestFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // initialising the arrays
        int[] ages = new int[3];
        int[] heights = new int[3];
        String[] names = {"Amar", "Akbar", "Anthony"};

        // Input ages and heights
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.println("Enter height of " + names[i] + ": ");
            heights[i] = sc.nextInt();
        }

        // Find the youngest and tallest friend
        int minAgeIndex = 0;
        int maxHeightIndex = 0;

        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[minAgeIndex]) {
                minAgeIndex = i;
            }
            if (heights[i] > heights[maxHeightIndex]) {
                maxHeightIndex = i;
            }
        }

        // Display the youngest and tallest friends
        System.out.println("The youngest friend is " + names[minAgeIndex] + " with age " + ages[minAgeIndex]);
        System.out.println("The tallest friend is " + names[maxHeightIndex] + " with height " + heights[maxHeightIndex]);        
    }
}

