package com.company;

import java.util.Scanner;

public class CharsToString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char c1 = sc.nextLine().charAt(0);
        char c2 = sc.nextLine().charAt(0);
        char c3 = sc.nextLine().charAt(0);

        System.out.printf("%c%c%c", c1, c2,c3);
    }
}
