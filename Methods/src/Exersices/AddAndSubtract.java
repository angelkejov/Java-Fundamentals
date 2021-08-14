package Exersices;

import java.util.Scanner;

public class AddAndSubtract {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = Integer.parseInt(sc.nextLine());
        int n2 = Integer.parseInt(sc.nextLine());
        int n3 = Integer.parseInt(sc.nextLine());

        int res = subtract(n1, n2, n3);
        System.out.println(res);
    }

    private static int sum(int n1, int n2) {
        return n1 + n2;
    }

    private static int subtract(int n1, int n2, int n3) {
        return sum(n1, n2) - n3;
    }
}
