package Exersices;

import java.util.Scanner;

public class PalindromeIntegers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine();

        while(!command.equals("END")) {
            System.out.println(isPalindrome(command));

            command = sc.nextLine();
        }
    }

    private static boolean isPalindrome(String number) {
        String reversedNumber = getReversedNumber(number);
        if (number.equals(reversedNumber)) {
            return true;
        } else {
            return false;
        }
    }

    private static String getReversedNumber(String number) {
        String reversed = "";
        for (int index = number.length() - 1; index >= 0; index--) {
            char currChar = number.charAt(index);
            reversed += currChar;
        }
        return reversed;
    }
}
