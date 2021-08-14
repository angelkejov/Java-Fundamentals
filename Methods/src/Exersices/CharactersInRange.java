package Exersices;

import java.util.Scanner;

public class CharactersInRange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch1 = sc.nextLine().charAt(0);
        char ch2 = sc.nextLine().charAt(0);
        charInRange(ch1, ch2);
    }

    private static void charInRange(char ch1, int ch2) {
        if (ch1 < ch2) {
            for (char i = (char) (ch1 + 1); i < ch2; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (char i = (char) (ch2 + 1); i < ch1; i++) {
                System.out.print(i + " ");
            }
        }
    }
}
