package ForLoops.exercises;

import java.util.Scanner;

public class NumbersEndingInSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Числата до 1000 които завършват на 7
        for (int i = 7; i <= 997; i+=10) {
                System.out.println(i);
        }
    }
}
