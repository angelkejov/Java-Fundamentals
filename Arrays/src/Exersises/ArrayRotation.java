package Exersises;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int rotations = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= rotations; i++) {
            int firstIndex = arr[0];

            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = firstIndex;
        }

        for (int i : arr) {
            System.out.printf(i + " ");
        }
    }
}
