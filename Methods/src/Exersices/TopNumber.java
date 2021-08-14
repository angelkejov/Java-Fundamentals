package Exersices;

import java.util.Scanner;

public class TopNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = Integer.parseInt(sc.nextLine());
        printTopNumbersUpTo(number);
    }

    private static void printTopNumbersUpTo(int number) {
        for (int i = 1; i <= number; i++) {
            if (isDigitSumDivisibleBy8(i) && hasOddDigit(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean hasOddDigit(int number) {
        while (number > 0) {
            if ((number % 10) % 2 == 1) {
                return true;
            }
            number /= 10;
        }

        return false;
    }

    private static boolean isDigitSumDivisibleBy8(int number) {
        int digitSum = 0;
        while (number > 0) {
            digitSum += number % 10;
            number /= 10;
        }

        if (digitSum % 8 == 0) {
            return true;
        }
        return false;
    }
}
