package Simple_Conditions;

import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        if (minutes + 15 > 59) {
            hours++;
            if (hours > 23) {
                hours = 0;
            }
            minutes = minutes + 15 - 60;

        } else {
            minutes += 15;
        }

        if (minutes <= 9) {
            System.out.printf("%d:0%d", hours, minutes);
        } else {
            System.out.printf("%d:%d", hours, minutes);
        }

    }
}
