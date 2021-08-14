package Exersises;

import java.util.Scanner;

public class PrintAndSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int startIndex = Integer.parseInt(sc.nextLine());
        int endIndex = Integer.parseInt(sc.nextLine());
        int sum = 0;
        for (int i = startIndex; i <= endIndex; i++) {
            System.out.print(i + " ");
            sum += i;
        }

        System.out.printf("%nSum: %d", sum);
    }
}
