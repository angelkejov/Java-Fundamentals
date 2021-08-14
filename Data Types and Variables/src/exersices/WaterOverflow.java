package exersices;

import java.util.Scanner;

public class WaterOverflow {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int tank = 255;
        int total = 0;
        for (int i = 0; i < n; i++) {
            int liters = Integer.parseInt(sc.nextLine());
            total += liters;
            if (total > tank) {
                System.out.println("Insufficient capacity!");
                total -= liters;
            }
        }
        System.out.println(total);
    }
}
