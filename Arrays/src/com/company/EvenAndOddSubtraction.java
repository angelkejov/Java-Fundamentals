package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arrNumbers = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int oddSum = 0;
        int evenSum = 0;
        for (int i = 0; i < arrNumbers.length; i++) {
            if (arrNumbers[i] % 2 != 0) {
                oddSum += arrNumbers[i];
            } else {
                evenSum += arrNumbers[i];
            }
        }
        int diff = evenSum - oddSum;
        System.out.println(diff);
    }
}
