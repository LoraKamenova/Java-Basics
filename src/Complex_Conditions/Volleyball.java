package Complex_Conditions;

import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfYear = scanner.nextLine().toLowerCase();
        int holidays = Integer.parseInt(scanner.nextLine());
        int weekends = Integer.parseInt(scanner.nextLine());

        double playingHolidays = holidays * 1.00 * 2/3;
        double playingWeekendsInSofia = (48 - weekends) * 1.00  * 3/4;

        double totalPlays = playingHolidays + playingWeekendsInSofia + weekends;

        if (typeOfYear.equals("leap")) {
            totalPlays = totalPlays * 1.15;
        }

        System.out.printf("%.0f", Math.floor(totalPlays));

    }
}
