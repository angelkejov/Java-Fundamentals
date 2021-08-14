package Exersises;

import java.util.Scanner;

public class CharacterMultiplier {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstWord = sc.next();
        String secondWord = sc.next();
        System.out.println(multiplyCharacters(firstWord, secondWord));
    }

    public static long multiplyCharacters (String firstString, String secondString) {
        char[] firstWord = firstString.toCharArray();
        char[] secondWord = secondString.toCharArray();
        long sum = 0;
        long tempSum = 0;
        int shorterWord = Math.min(firstWord.length, secondWord.length);
        int longestWord = Math.max(firstWord.length, secondWord.length);

        for (int i = 0; i < shorterWord; i++) {
            tempSum = (long) (int) firstWord[i] * (int) secondWord[i];
            sum += tempSum;
        }

        if (firstWord.length < secondWord.length) {
            for (int i = shorterWord; i <= longestWord - 1; i++) {
                sum += secondWord[i];
            }
        } else if (firstWord.length > secondWord.length) {
            for (int i = shorterWord; i <= longestWord - 1; i++) {
                sum += firstWord[i];
            }
        }
        return sum;

    }
}
