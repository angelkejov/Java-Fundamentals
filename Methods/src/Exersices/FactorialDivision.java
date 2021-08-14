package Exersices;

import java.util.Scanner;

public class FactorialDivision {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = Integer.parseInt(sc.nextLine());
        int n2 = Integer.parseInt(sc.nextLine());
        double res = factorial(n1) / factorial(n2);
        System.out.printf("%.2f", res);
    }

    private static double factorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
