package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        for (int i = 0; i < numbers.size() - 1; i++) {
            int sum = numbers.get(i) + numbers.get(numbers.size() - 1);
            numbers.remove(numbers.size() - 1);
            numbers.remove(numbers.get(i));
            numbers.add(0, sum);
        }

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
