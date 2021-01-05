package Advanced_Loops;

import java.util.Scanner;

public class SumDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int lastDigit = 0;
        int sum = 0;

        while (n != 0) {
            lastDigit = n % 10;;
            sum += lastDigit;
            n /= 10;
        }

        System.out.println(sum);
    }
}
