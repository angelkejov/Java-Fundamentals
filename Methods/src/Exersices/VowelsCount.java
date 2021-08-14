package Exersices;

import java.util.Locale;
import java.util.Scanner;

public class VowelsCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine().toLowerCase();
        int counter = printCountVowels(text);
        System.out.println(counter);
    }

    private static int printCountVowels(String text) {
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
           char currChar = text.charAt(i);
           if (currChar == 'a' || currChar == 'o' || currChar == 'u'
                   || currChar == 'e' || currChar == 'i') {
               counter++;
           }
        }
        return counter;
    }
}
