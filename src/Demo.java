import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int  n = Integer.parseInt(scanner.nextLine());
//        // жури от трима души
//        for (int i = 1; i <= n; i++) {
//            // Всеки член на журито дава оценка до получване на команда "stop"
//            String input = scanner.nextLine();
//            while (!input.equals("stop")){
//                int grade = Integer.parseInt(input);
//                System.out.println(grade);
//                input = scanner.nextLine();
//            }
//        }

        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < 60; j++) {
                System.out.printf("%02d:%02d%n",i,j);
            }
        }
    }
}
