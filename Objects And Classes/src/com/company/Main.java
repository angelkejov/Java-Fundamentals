package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] words = sc.nextLine().split("\\s+");
        Random rnd = new Random();
        for (int i = 0; i < words.length; i++) {
            int first = rnd.nextInt(words.length);

            String a = words[first];
            String b = words[i];

            words[first] = b;
            words[i] = a;
        }
        for (String word : words) {
            System.out.println(word);
        }
    }
}
