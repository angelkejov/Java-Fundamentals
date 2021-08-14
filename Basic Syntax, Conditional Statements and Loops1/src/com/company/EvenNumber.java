package com.company;

import java.util.Scanner;

public class EvenNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        while (true) {
            if (n % 2 == 0) {
                int absN = Math.abs(n);
                System.out.printf("The number is: %d", absN);
                break;
            } else {
                System.out.println("Please write an even number.");
                n = Integer.parseInt(sc.nextLine());
            }
        }
    }
}
