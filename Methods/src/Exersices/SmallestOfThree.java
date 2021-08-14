package Exersices;

import java.util.Scanner;

public class SmallestOfThree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = Integer.parseInt(sc.nextLine());
        int n2 = Integer.parseInt(sc.nextLine());
        int n3 = Integer.parseInt(sc.nextLine());
        System.out.println(getSmallest(n1, n2, n3));
    }

    private static int getSmallest(int a, int b, int c) {
        int smallest = 0;
        if (a <= b && a <= c) {
            smallest = a;
        } else if (b <= c && b <= a) {
            smallest = b;
        } else {
            smallest = c;
        }

        return smallest;
    }
}
