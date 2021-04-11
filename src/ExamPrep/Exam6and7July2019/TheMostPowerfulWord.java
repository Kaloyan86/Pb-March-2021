package ExamPrep.Exam6and7July2019;

import java.util.Scanner;

public class TheMostPowerfulWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        double maxPower = Double.NEGATIVE_INFINITY;
        String maxWord = "";
        while (!word.equals("End of words")) {
            int asciSum = 0;
            double result = 0;
            boolean isVowel = false;
            for (int i = 0; i < word.length(); i++) {
                char symbol = word.charAt(i);
                char firstSymbol = word.charAt(0);
                //  'a', 'e', 'i', 'o', 'u', 'y' - или техните еквивалентни главни букви
                if (firstSymbol == 'a' || firstSymbol == 'A' ||
                        firstSymbol == 'e' || firstSymbol == 'E' ||
                        firstSymbol == 'i' || firstSymbol == 'I' ||
                        firstSymbol == 'o' || firstSymbol == 'O' ||
                        firstSymbol == 'u' || firstSymbol == 'U' ||
                        firstSymbol == 'y' || firstSymbol == 'Y') {
                    isVowel = true;
                }
                asciSum += symbol;
            }
            if (isVowel) {
                result = asciSum * word.length();
            } else {
                result = Math.floor(asciSum / word.length());
            }

            if (result > maxPower) {
                maxPower = result;
                maxWord = word;
            }

            word = scanner.nextLine();
        }
        System.out.printf("The most powerful word is %s - %.0f", maxWord, maxPower);
    }
}
