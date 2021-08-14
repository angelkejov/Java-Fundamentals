package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class EqualArrays {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] firstArray = getIntArrayFromString(scan.nextLine());
        int[] secondArray = getIntArrayFromString(scan.nextLine());

        String output = IntStream
                .range(0, firstArray.length)
                .filter(index -> firstArray[index] != secondArray[index])
                .mapToObj(index -> String.format(
                        "Arrays are not identical. Found difference at %d index.",
                        index))
                .findFirst()
                .orElse(String.format(
                        "Arrays are identical. Sum: %d",
                        Arrays.stream(firstArray).sum()));

        System.out.println(output);
    }

    private static int[] getIntArrayFromString(String str) {
        return Arrays.stream(str.trim().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
