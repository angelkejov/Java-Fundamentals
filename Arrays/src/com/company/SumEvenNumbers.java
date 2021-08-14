package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numberArray = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;
        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] % 2 == 0) {
                sum += numberArray[i];
            }
        }
        System.out.println(sum);
    }
}
