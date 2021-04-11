package NestedLoops.labs;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        boolean isMagic = false;
        int combinations = 0;
        int n1 = 0;
        int n2 = 0;
        for (int i = x; i <= y; i++) {
            for (int j = x; j <= y; j++) {
                combinations++;
                if (i + j == magicNumber) {
                    isMagic = true;
                    n1 = i;
                    n2 = j;
                    break;
                }
            }
            if (isMagic) {
                break;
            }
        }
        if (isMagic) {
            System.out.printf("Combination N:%d (%d + %d = %d)", combinations, n1, n2, magicNumber);
        } else {
            System.out.printf("%d combinations - neither equals %d", combinations, magicNumber);
        }

    }
}
