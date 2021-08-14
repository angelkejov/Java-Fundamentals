package com.company;

import java.util.Scanner;

public class MathOperations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int firstNumber = Integer.parseInt(sc.nextLine());
        String operator = sc.nextLine();
        int secondNumber = Integer.parseInt(sc.nextLine());
        int res = (int) calculate(firstNumber, operator, secondNumber);
        System.out.println(res);
    }

    private static double calculate(int n1, String op, int n2) {
        double result = 0.0;
        if (op.equals("+")) {
            result = n1 + n2;
        } else if (op.equals("-")) {
            result = n1 - n2;
        } else if (op.equals("*")) {
            result = n1 * n2;
        } else if (op.equals("/")) {
            result = n1 / n2;
        }

        return result;
    }
}
