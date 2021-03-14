package ConditionalStatements.exercises;

import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double income = Double.parseDouble(scanner.nextLine());
        double avgScore = Double.parseDouble(scanner.nextLine());
        double minSalary = Double.parseDouble(scanner.nextLine());

        double socialScholarship = 0.0;
        double excellentScholarship = 0.0;
        boolean isApproved = false; // red traffic light

        // Проверка за социална стипендия
        if (income < minSalary && avgScore > 4.50) {
            isApproved = true; // green
            socialScholarship = Math.floor(minSalary * 0.35);
        }

        // Проверка за отлична стипендия
        if (avgScore >= 5.50) {
            isApproved = true; // green
            excellentScholarship = Math.floor(avgScore * 25);
        }

        //if   // Проверка дали изобщо може да получи някаква стипендия
        if (!isApproved) {
            System.out.println("You cannot get a scholarship!");

            // else if   // Проверка коя стипендия е по-висока и ще дадем нея
        } else if (socialScholarship > excellentScholarship) {
            System.out.printf("You get a Social scholarship %.0f BGN", socialScholarship);
        } else if (excellentScholarship >= socialScholarship) {
            System.out.printf("You get a scholarship for excellent results %.0f BGN", excellentScholarship);
        }

    }
}
