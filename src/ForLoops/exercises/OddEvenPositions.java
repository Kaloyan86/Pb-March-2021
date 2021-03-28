package ForLoops.exercises;

import java.util.Scanner;

public class OddEvenPositions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double oddSum = 0;
        double oddMin = Double.POSITIVE_INFINITY;
        double oddMax = Double.NEGATIVE_INFINITY;
        double evenSum = 0;
        double evenMin = Double.POSITIVE_INFINITY;
        double evenMax = Double.NEGATIVE_INFINITY;
        for (int i = 1; i <= n; i++) {
            double number = Double.parseDouble(scanner.nextLine());

            // Четни позиции
            if (i % 2 == 0) {
                evenSum += number;
                // Проверка за минимално число
                if (number < evenMin) {
                    evenMin = number;
                }
                // Проверка за максимално число
                if (number > evenMax) {
                    evenMax = number;
                }
            } else { // Нечетни позиции
                oddSum += number;
                // Проверка за минимално число
                if (number < oddMin) {
                    oddMin = number;
                }
                // Проверка за максимално число
                if (number > oddMax) {
                    oddMax = number;
                }
            }
        }

        System.out.printf("OddSum=%.2f,%n", oddSum);
        if (oddSum == 0) {
            System.out.printf("OddMin=No,%nOddMax=No,%n");
        } else {
            System.out.printf("OddMin=%.2f,%nOddMax=%.2f,%n", oddMin, oddMax);
        }

        System.out.printf("EvenSum=%.2f,%n", evenSum);
        if (evenSum == 0) {
            System.out.printf("EvenMin=No,%nEvenMax=No");
        } else {
            System.out.printf("EvenMin=%.2f,%nEvenMax=%.2f", evenMin, evenMax);
        }
    }
}
