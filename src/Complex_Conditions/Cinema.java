package Complex_Conditions;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine().toLowerCase();
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        double profit = 0;

        if (type.equals("premiere")) {
            profit = rows * cols * 12.00;
        } else if (type.equals("normal")) {
            profit = rows * cols * 7.50;
        } else if (type.equals("discount")) {
            profit = rows * cols * 5.00;
        }
        System.out.printf("%.2f", profit);
    }
}
