package Exersises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(", ");
        List<String> output = new ArrayList<>();
        for (String username : arr) {
            if (validateUser(username)) {
                output.add(username);
            }
        }

        for (String s : output) {
            System.out.println(s);
        }
    }

    private static boolean validateUser(String word) {
        boolean isValid = true;
        if (word.length() <= 3 || word.length() >= 16) {
            isValid = false;
        }

        for (int i = 0; i < word.length(); i++) {
            char currChar = word.charAt(i);
            if (!Character.isLetterOrDigit(currChar) &&
                    currChar != '_' && currChar != '-') {
                isValid = false;
            }
        }

        return isValid;
    }
}
