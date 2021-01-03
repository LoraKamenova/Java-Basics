package Complex_Conditions;

import java.util.Scanner;

public class TradeComissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine().toLowerCase();
        double sales = Double.parseDouble(scanner.nextLine());
        double commision = 0;

        if (town.equals("sofia")) {
            if (sales >= 0 && sales <= 500) {
                commision = sales * 5/100;
            } else if (sales > 500 && sales <= 1000) {
                commision = sales * 7/100;
            } else if (sales > 1000 && sales <= 10000) {
                commision = sales * 8/100;
            } else if (sales > 10000) {
                commision = sales * 12/100;
            } else {
                System.out.println("error");
            }

            System.out.printf("%.2f", commision);
        } else if (town.equals("varna")) {
            if (sales >= 0 && sales <= 500) {
                commision = sales * 4.5/100;
            } else if (sales > 500 && sales <= 1000) {
                commision = sales * 7.5/100;
            } else if (sales > 1000 && sales <= 10000) {
                commision = sales * 10/100;
            } else if (sales > 10000) {
                commision = sales * 13/100;
            } else {
                System.out.println("error");
            }

            System.out.printf("%.2f", commision);
        } else if (town.equals("plovdiv")) {
            if (sales >= 0 && sales <= 500) {
                commision = sales * 5.5/100;
            } else if (sales > 500 && sales <= 1000) {
                commision = sales * 8/100;
            } else if (sales > 1000 && sales <= 10000) {
                commision = sales * 12/100;
            } else if (sales > 10000) {
                commision = sales * 14.5/100;
            } else {
                System.out.println("error");
            }

            System.out.printf("%.2f", commision);
        } else {
            System.out.println("error");
        }
    }
}
