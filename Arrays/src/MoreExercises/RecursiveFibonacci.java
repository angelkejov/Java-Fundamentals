package MoreExercises;

import java.util.Scanner;

public class RecursiveFibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int res = Math.abs(fibonacci(n));
        System.out.println(res);
    }

    private static int fibonacci(int n) {
        if (n <= 0) {
            return n;
        }

        return fibonacci(n - 1) + (fibonacci(n - 2));
    }
}
