package MoreExersices;

import java.util.Scanner;

public class MultiplicationSign {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = Integer.parseInt(sc.nextLine());
        int num2 = Integer.parseInt(sc.nextLine());
        int num3 = Integer.parseInt(sc.nextLine());

        isPositive(num1, num2, num3);
    }

    private static void isPositive(int num1, int num2, int num3) {
        if (num1 < 0 || num2 < 0 || num3 < 0) {
            System.out.println("negative");
        } else if (num1 == 0 || num2 == 0 || num3 == 0) {
            System.out.println("zero");
        } else {
            System.out.println("positive");
        }
    }
}
