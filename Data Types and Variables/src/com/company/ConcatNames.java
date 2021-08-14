package com.company;

import java.util.Scanner;

public class ConcatNames {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String first = sc.nextLine();
        String second = sc.nextLine();
        String sign = sc.nextLine();
        System.out.println(first.concat(sign).concat(second));
    }
}
