package Advanced_Loops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int f0 = 1;
        int f1 = 1;
        int current;

        if (n < 2) {
            System.out.println(1);
        } else {
            for (int i = 2; i <= n; i++) {
                current = f0 + f1;
                f0 = f1;
                f1 = current;
            }
        }
        System.out.println(f1);
    }
}
