package Advanced_Loops;

import java.util.Scanner;

public class Sequence2kPlus1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int firstNumber = 1;

        for (int i = 0; i < n; i++) {
            if (firstNumber <= n) {
                System.out.println(firstNumber);
            } else {
                break;
            }

            firstNumber = firstNumber * 2 + 1;

        }
    }
}
