package com.company;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Double> numbers = Arrays.stream(sc.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());
        for (int i = 0; i < numbers.size() - 1; i++) {
            double currNum = numbers.get(i);
            double nextNum = numbers.get(i + 1);

            if (currNum == nextNum) {
                double sum = currNum + nextNum;
                numbers.set(i, sum);
                numbers.remove(i + 1);
                i--;
            }
        }
        DecimalFormat decimalFormat = new DecimalFormat("0.#");
        for (Double number : numbers) {
            System.out.print(decimalFormat.format(number) + " ");
        }
    }

    public static class RemoveNegativesAndReverse {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            List<Integer> numbers = Arrays.stream(sc.nextLine().split("\\s+"))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
            numbers.removeIf(n -> n < 0);
            if (numbers.isEmpty()) {
                System.out.println("empty");
            } else {
                for (int i = numbers.size() - 1; i >= 0; i--) {
                    System.out.print(numbers.get(i) + " ");
                }
            }
        }
    }
}
