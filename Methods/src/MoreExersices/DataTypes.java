package MoreExersices;

import java.util.Scanner;

public class DataTypes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String type = sc.nextLine();
        if (type.equals("int")) {
            int n = Integer.parseInt(sc.nextLine());
            System.out.println(intMethod(n));
        } else if (type.equals("real")) {
            double n = Double.parseDouble(sc.nextLine());
            doubleMethod(n);
        } else if (type.equals("string")) {
            String input = sc.nextLine();
            stringMethod(input);
        }
    }

    private static int intMethod(int number) {
        return number * 2;
    }

    private static void doubleMethod(double number) {
        double res = number * 1.5;
        System.out.printf("%.2f", res);
    }

    private static void stringMethod(String input) {
        System.out.printf("$%s$", input);
    }
}
