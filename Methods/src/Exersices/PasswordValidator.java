package Exersices;

import java.util.Scanner;

public class PasswordValidator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String password = sc.nextLine();
        boolean isValidLength = charCondition(password);
        if (!isValidLength) {
            System.out.println("Password must be between 6 and 10 characters");
        }

        boolean isContainsAnySpecial = isContainsAnySpecial(password);
        if (!isContainsAnySpecial) {
            System.out.println("Password must consist only of letters and digits");
        }

        boolean isTwoOrMoreDigits = isValidCountOfDigits(password);
        if (!isTwoOrMoreDigits) {
            System.out.println("Password must have at least 2 digits");
        }

        if (isContainsAnySpecial && isTwoOrMoreDigits && isValidLength) {
            System.out.println("Password is valid");
        }
    }

    private static boolean charCondition(String password) {
        if (password.length() < 6 || password.length() > 10) {
            return false;
        } else {
            return true;
        }
    }

    private static boolean isContainsAnySpecial(String password) {
        for (int i = 0; i < password.length(); i++) {
            char currChar = password.charAt(i);
            if (!Character.isLetterOrDigit(currChar)) {
                return false;
            }
        }

        return true;
    }

    private static boolean isValidCountOfDigits(String password) {
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            char currChar = password.charAt(i);

            if (Character.isDigit(currChar)) {
                count++;
            }
        }

        if (count >= 2) {
            return true;
        } else {
            return false;
        }
    }
}
