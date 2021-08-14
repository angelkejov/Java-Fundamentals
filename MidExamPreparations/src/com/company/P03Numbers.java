package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class P03Numbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> resList = new ArrayList<>();

        int averageNumber = 0;
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            int curr = numbers.get(i);
            sum += curr;
            averageNumber = sum / numbers.size();
        }
        if (numbers.size() <= 0) {
            System.out.println("No");
        }

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > averageNumber) {
                resList.add(numbers.get(i));
            }
        }
        printAndSort(resList);
    }

    private static void printAndSort(List<Integer> list) {
        List<Integer> g = new ArrayList<>();
        Collections.sort(list);
        for (int i = list.size() - 1; i >= 0; i--) {
            g.add(list.get(i));
        }
        if (g.size() <= 0) {
            System.out.println("No");
        } else if (g.size() >= 5){
            for (int i = 0; i < 5; i++) {
                System.out.print(g.get(i) + " ");
            }
        } else {
            for (int i = 0; i < g.size(); i++) {
                System.out.print(g.get(i) + " ");
            }
        }
    }
}
