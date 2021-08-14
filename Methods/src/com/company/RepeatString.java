package com.company;

import java.util.Scanner;

public class RepeatString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int count = Integer.parseInt(sc.nextLine());
        System.out.println(repeat(input, count));
    }

    private static String repeat(String str, int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result = result.concat(str);
        }

        return result;
    }
}
