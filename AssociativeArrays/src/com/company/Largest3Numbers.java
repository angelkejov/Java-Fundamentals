package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Largest3Numbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt).sorted(Integer::compareTo)
                .collect(Collectors.toList());

        findTopThree(numbers);
    }

    private static void findTopThree(List<Integer> arr) {
        int first = 0;
        int second = 0;
        int third = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > first) {
                third = second;
                second = first;
                first = arr.get(i);
            } else if (arr.get(i) > second) {
                third = second;
                second = arr.get(i);
            } else if (arr.get(i) > third) {
                third = arr.get(i);
            }
        }
        if (arr.size() <= 3) {
            
        } else {
            System.out.print(first + " " + second + " " + third);
        }
    }
}
