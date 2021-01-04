package Advanced_Loops;

import java.util.Scanner;

public class PowersOfTwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int currentNumber = 1;
        System.out.println(currentNumber);
        for (int i = 1; i <= n; i++) {
            currentNumber *= 2;
            System.out.println(currentNumber);
        }
    }
}
