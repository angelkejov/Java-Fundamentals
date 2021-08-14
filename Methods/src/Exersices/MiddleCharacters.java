package Exersices;

import java.util.Scanner;

public class MiddleCharacters {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        printMiddle(text);
    }

    private static void printMiddle(String text) {
        if (text.length() % 2 != 0) {
            int indexOfMiddleCharacter = text.length() / 2;
            System.out.println(text.charAt(indexOfMiddleCharacter));
        } else {
            int indexFirstMiddleCharacter = text.length() / 2 - 1;
            int indexSecondMiddleCharacter = text.length() / 2;
            System.out.printf("%c%c", text.charAt(indexFirstMiddleCharacter),
                    text.charAt(indexSecondMiddleCharacter));
        }
    }
}
