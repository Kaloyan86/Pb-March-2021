package WhileLoop.exercises;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int poorGradesLimit = Integer.parseInt(scanner.nextLine());
        String problemName = scanner.nextLine();

        int poorGradesCount = 0;
        boolean isFailed = false;
        double allGradesSum = 0;
        int allGrades = 0;
        String lastProblem = "";

        while (!problemName.equals("Enough")) {
            int grade = Integer.parseInt(scanner.nextLine());
            allGrades++;
            allGradesSum += grade;
            if (grade <= 4) {
                poorGradesCount++;
                if (poorGradesLimit == poorGradesCount) {
                    isFailed = true;
                    break;
                }
            }
            lastProblem = problemName;
            problemName = scanner.nextLine();
        }

        double avgScore = allGradesSum / allGrades;

        if (isFailed) {
            System.out.printf("You need a break, %d poor grades.", poorGradesCount);
        } else {
            System.out.printf("Average score: %.2f\n" +
                    "Number of problems: %d\n" +
                    "Last problem: %s\n", avgScore, allGrades, lastProblem);
        }
    }
}
