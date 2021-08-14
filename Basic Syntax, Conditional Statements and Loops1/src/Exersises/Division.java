package Exersises;

import java.util.Scanner;

public class Division {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int[] ar = { 2,3,6,7,10 };
        int x = 0;

        for (int i = 0; i < ar.length; i++) {
            if (( num % ar[i] == 0 ) && ( ar[i] > x )) x = ar[i];
        }

        if (x == 0) System.out.printf("Not divisible");
        else System.out.printf("The number is divisible by %d", x);

    }
}