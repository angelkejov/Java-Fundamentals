package MoreExercises;

import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortAndPrintArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int[] arrOfNumbers = new int[n];
        for (int i = 0; i < n; i++) {
            int sum = 0;
            String input = sc.nextLine();

            for (int j = 0; j < input.length(); j++) {
                char currChar = input.charAt(j);

                if (isVowel(currChar)) {
                    sum += currChar * input.length();
                } else {
                    sum += currChar / input.length();
                }
            }
            arrOfNumbers[i] = sum;
        }
        Arrays.sort(arrOfNumbers);

        for (int arrOfNumber : arrOfNumbers) {
            System.out.println(arrOfNumber);
        }
    }

    public static boolean isVowel(char c) {
        String vowels = "aeiouAEIOU";
        return vowels.contains(c + "");
    }
}
