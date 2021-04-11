package NestedLoops.exercises;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int num = 0;
        boolean isEqual = false;
        for (int rows = 1; rows <= n; rows++) {
            for (int col = 1; col <= rows; col++) {
                num++;
                // Прекъсваме вътрешния for loop
                if (num > n) {
                    isEqual = true;
                    break;
                }
                System.out.print(num + " ");
            }
            // Прекъсваме външния for loop
            if (isEqual) {
                break;
            }
            System.out.println();
        }
    }
}
