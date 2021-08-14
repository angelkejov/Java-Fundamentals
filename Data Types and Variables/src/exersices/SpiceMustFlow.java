package exersices;

import java.util.Scanner;

public class SpiceMustFlow {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int yield = Integer.parseInt(sc.nextLine());
        int totalAmount = 0;
        int days = 0;

        while(yield >= 100) {
            int workedSpices = yield - 26;
            totalAmount += workedSpices;

            yield -= 10;
            days++;
        }

        System.out.println(days);
        if (totalAmount >= 26) {
            totalAmount -= 26;
        }

        System.out.println(totalAmount);
    }
}
