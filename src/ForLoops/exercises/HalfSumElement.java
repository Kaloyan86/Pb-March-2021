package ForLoops.exercises;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int maxNumber = Integer.MIN_VALUE;

        int sum = 0;
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            sum += number;
            //Проверка за максимално число
            if (number > maxNumber) {
                maxNumber = number;
            }
        }
        sum -= maxNumber;
        if (sum == maxNumber) {
            System.out.printf("Yes%nSum = %d", maxNumber);
        } else {
            System.out.printf("No%nDiff = %d", Math.abs(sum - maxNumber));
        }
    }
}
