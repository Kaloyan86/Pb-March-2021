package WhileLoop.exercises;

import java.util.Scanner;

public class OldLibrary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String searchedBook = scanner.nextLine();
        String currentBook = scanner.nextLine();

        int bookCounter = 0;
        boolean isFound = false;
        while (!currentBook.equals("No More Books")) {

            if (searchedBook.equals(currentBook)) {
                isFound = true;
                break;
            }
            bookCounter++;

            currentBook = scanner.nextLine();
        }

        if (isFound){
            System.out.printf("You checked %d books and found it.", bookCounter);
        }else {
            System.out.printf("The book you search is not here!\n" +
                    "You checked %d books.\n", bookCounter);
        }
    }
}
