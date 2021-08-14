package com.company;

import java.util.Scanner;

public class Calculations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String operation = sc.nextLine();
        int firstNumber = Integer.parseInt(sc.nextLine());
        int secondNumber = Integer.parseInt(sc.nextLine());

        if (operation.equals("add")) {
            System.out.println(add(firstNumber, secondNumber));
        } else if (operation.equals("multiply")) {
            System.out.println(multiply(firstNumber, secondNumber));
        } else if (operation.equals("subtract")) {
            System.out.println(subtract(firstNumber, secondNumber));
        } else if (operation.equals("divide")) {
            System.out.println(divide(firstNumber, secondNumber));
        }
    }

    private static int add(int n1, int n2) {
        return n1 + n2;
    }

    private static int multiply(int n1, int n2) {
        return n1 * n2;
    }

    private static int subtract(int n1, int n2) {
        return n1 - n2;
    }

    private static int divide(int n1, int n2) {
        return n1 / n2;
    }
}
