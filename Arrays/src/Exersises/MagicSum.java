package Exersises;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int n = Integer.parseInt(sc.nextLine());
        findMagicSum(arr, n);
    }

    private static void findMagicSum(int[] arr, int n) {
        for (int i = 0; i < arr.length - 1; i++) {
            int curr = arr[i];

            for (int j = i + 1; j < arr.length; j++) {
                if (curr + arr[j] == n) {
                    System.out.printf("%d %d%n", curr, arr[j]);
                }
            }
        }
    }
}
