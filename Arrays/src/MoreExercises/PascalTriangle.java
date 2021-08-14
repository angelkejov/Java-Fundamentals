package MoreExercises;

import java.util.Scanner;

public class PascalTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        printPascal(n);
    }

    public static void printPascal(int n) {

        for (int line = 1; line <= n; line++) {

            int c = 1;
            for (int i = 1; i <= line; i++) {
                System.out.print(c + " ");
                c = c * (line - i) / i;
            }
            System.out.println();
        }
    }
}