package Exersises;

import java.util.Scanner;

public class ZigZagArrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(" ");
            int firtsNumber = Integer.parseInt(input[0]);
            int secondNumber = Integer.parseInt(input[1]);

            if ((i + 1) % 2 == 0) {
                arr1[i] = secondNumber;
                arr2[i] = firtsNumber;
            } else {
                arr1[i] = firtsNumber;
                arr2[i] = secondNumber;
            }
        }

        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : arr2) {
            System.out.print(i + " ");
        }
    }
}
