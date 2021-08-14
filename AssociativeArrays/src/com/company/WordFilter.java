package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class WordFilter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] words = (String[]) Arrays.stream(sc.nextLine().split("\\s+"))
                .filter(e -> e.length() % 2 == 0)
                .toArray(String[]::new);

        for (String word : words) {
            System.out.println(word);
        }
    }
}
