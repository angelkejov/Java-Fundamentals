package com.company;

import java.util.*;

public class OddOccurrences {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = sc.nextLine().split("\\s+");

        Map<String, Integer> map = new LinkedHashMap<>();

        for (String word : arr) {
            String lowercaseWord = word.toLowerCase();

            if (!map.containsKey(lowercaseWord)) {
                map.put(lowercaseWord, 1);
            } else {
                map.put(lowercaseWord, map.get(lowercaseWord) + 1);
            }
        }

        List<String> odds = new ArrayList<>();
        for (var s : map.entrySet()) {
            if (s.getValue() % 2 == 1) {
                odds.add(s.getKey());
            }
        }

        for (int i = 0; i < odds.size(); i++) {
            System.out.print(odds.get(i));
            if (i < odds.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}
