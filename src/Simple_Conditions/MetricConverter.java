package Simple_Conditions;

import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        String inputUnit = scanner.nextLine();
        String outputUnit = scanner.nextLine();

        double convertedNumber = 0;
        double finalNumber = 0;

        //converting to meters
        if (inputUnit.equals("m")) {
            convertedNumber = number;
        } else if (inputUnit.equals("mm")) {
            convertedNumber = number / 1000;
        } else if (inputUnit.equals("cm")) {
            convertedNumber = number / 100;
        } else if (inputUnit.equals("mi")) {
            convertedNumber = number / 0.000621371192;
        } else if (inputUnit.equals("in")) {
            convertedNumber = number / 39.3700787;
        } else if (inputUnit.equals("km")) {
            convertedNumber = number / 0.001;
        } else if (inputUnit.equals("ft")) {
            convertedNumber = number / 3.2808399;
        } else if (inputUnit.equals("yd")) {
            convertedNumber = number / 1.0936133;
        }

        if (outputUnit.equals("m")) {
            finalNumber = convertedNumber;
        } else if (outputUnit.equals("mm")) {
            finalNumber = convertedNumber * 1000;
        } else if (outputUnit.equals("cm")) {
            finalNumber = convertedNumber * 100;
        } else if (outputUnit.equals("mi")) {
            finalNumber = convertedNumber * 0.000621371192;
        } else if (outputUnit.equals("in")) {
            finalNumber = convertedNumber * 39.3700787;
        } else if (outputUnit.equals("km")) {
            finalNumber = convertedNumber * 0.001;
        } else if (outputUnit.equals("ft")) {
            finalNumber = convertedNumber * 3.2808399;
        } else if (outputUnit.equals("yd")) {
            finalNumber = convertedNumber * 1.0936133;
        }

        System.out.printf("%.6f", finalNumber);
    }
}