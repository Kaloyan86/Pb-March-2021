package ConditionalStatementsAdvanced.exercises;

import java.util.Scanner;

public class OperationBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        int result = 0;
        String evenOrOdd = "";
        String output = "";
        // „+“, „-“, „*“, „/“, „%“
        switch (operator) {
            case "+":
                result = n1 + n2;
                if (result % 2 == 0) {
                    evenOrOdd = "even";
                } else {
                    evenOrOdd = "odd";
                }
                output = String.format("%d %s %d = %d – %s", n1, operator, n2, result, evenOrOdd);
                break;
            case "-":
                result = n1 - n2;
                if (result % 2 == 0) {
                    evenOrOdd = "even";
                } else {
                    evenOrOdd = "odd";
                }
                output = String.format("%d %s %d = %d – %s", n1, operator, n2, result, evenOrOdd);
                break;
            case "*":
                result = n1 * n2;
                if (result % 2 == 0) {
                    evenOrOdd = "even";
                } else {
                    evenOrOdd = "odd";
                }
                output = String.format("%d %s %d = %d – %s", n1, operator, n2, result, evenOrOdd);
                break;
            case "/":
                if (n2 == 0) {
                    output = String.format("Cannot divide %d by zero", n1);
                } else {
                    double divideResult = 1.0 * n1 / n2;
                    output = String.format("%d %s %d = %.2f", n1, operator, n2, divideResult);
                }
                break;
            case "%":
                if (n2 == 0) {
                    output = String.format("Cannot divide %d by zero", n1);
                } else {
                    result = n1 % n2;
                    output = String.format("%d %s %d = %d", n1, operator, n2, result);
                }
                break;
        }

        // Print
        System.out.println(output);

    }
}
