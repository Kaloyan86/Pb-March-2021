package ConditionalStatements.exercises;

import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        String output = scanner.nextLine();

        // input -> mm , cm , m
        // output -> mm, cm, m

        // Преобразуване на input в метри
        if (input.equals("mm")) {
            number = number / 1000;
        } else if (input.equals("cm")) {
            number = number / 100;
        }

        // Конвертиране на input-> output
        if (output.equals("mm")) {
            number = number * 1000;
        } else if (output.equals("cm")) {
            number = number * 100;
        }

        System.out.printf("%.3f", number);
    }
}
