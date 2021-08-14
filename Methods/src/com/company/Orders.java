package com.company;

import java.util.Scanner;

public class Orders {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String product = sc.nextLine();
        int quantity = Integer.parseInt(sc.nextLine());
        System.out.printf("%.2f", order(product, quantity));
    }

    private static double order(String product, int quantity) {
        double finalResult = 0;
        if (product.equals("coffee")) {
            finalResult = 1.50 * quantity;
        } else if (product.equals("water")) {
            finalResult = 1 * quantity;
        } else if (product.equals("coke")) {
            finalResult = 1.40 * quantity;
        } else if (product.equals("snacks")) {
            finalResult = 2 * quantity;
        }

        return finalResult;
    }
}
