package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> list = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        Map<Double, Integer> result = new TreeMap<>();

        for (Double aDouble : list) {
            if (!result.containsKey(aDouble)) {
                result.put(aDouble, 1);
            } else {
                int occurrences = result.get(aDouble);
                occurrences++;
                result.put(aDouble, occurrences);
            }
        }

        for (Map.Entry<Double, Integer> entry : result.entrySet()) {
            System.out.printf("%.0f -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
