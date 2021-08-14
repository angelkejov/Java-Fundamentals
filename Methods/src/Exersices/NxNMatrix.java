package Exersices;

import java.util.Scanner;

public class NxNMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        printMatrix(n);
    }

    private static void printMatrix(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                System.out.print(n + " ");
            }
            System.out.println(n);
        }
    }
}
