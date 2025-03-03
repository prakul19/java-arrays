import java.util.Scanner;

public class EmployeeBonus {

    public static void main(String[] args) {
        // Arrays for salaries, years, bonuses, new salaries
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        Scanner sc = new Scanner(System.in);

        // Input loop
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter salary for employee " + (i + 1) + ": ");
            salary[i] = sc.nextDouble();

            // Validate salary
            if (salary[i] < 0) {
                System.out.println("Invalid salary. Enter again.");
                i--;
                continue;
            }

            System.out.print("Enter years of service for employee " + (i + 1) + ": ");
            yearsOfService[i] = sc.nextDouble();

            // Validate years of service
            if (yearsOfService[i] < 0) {
                System.out.println("Invalid years of service. Enter again.");
                i--;
                continue;
            }
        }

        // Calculation loop
        for (int i = 0; i < 10; i++) {
            // Calculate bonus
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }
            newSalary[i] = salary[i] + bonus[i]; // New salary

            // Update totals
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Print totals
        System.out.println("Total bonus payout: " + totalBonus);
        System.out.println("Total old salary: " + totalOldSalary);
        System.out.println("Total new salary: " + totalNewSalary);
    }
}

