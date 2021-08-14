package Exersises;

import java.util.Scanner;

public class Train {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int[] arr = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int numbers = Integer.parseInt(sc.nextLine());

            sum += numbers;
            arr[i] = numbers;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println(sum);
    }
}
