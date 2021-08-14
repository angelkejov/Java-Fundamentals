package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int count = nums.length;
        while (count > 1) {
            for (int i = 0; i < count - 1; i++) {
                nums[i] += nums[i + 1];
            }
            count--;
        }

        System.out.println(nums[0]);
    }
}
