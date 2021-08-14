package Exersises;

import java.util.Scanner;

public class RageExpenses {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lostGames = Integer.parseInt(sc.nextLine());
        double headsetPrice = Double.parseDouble(sc.nextLine());
        double mousePrice = Double.parseDouble(sc.nextLine());
        double keyboardPrice = Double.parseDouble(sc.nextLine());
        double displayPrice = Double.parseDouble(sc.nextLine());

        int headsetCrashesCount = lostGames / 2;
        int mouseCrashesCount = lostGames / 3;
        int keyboardCrashesCount = lostGames / 6;
        int displayCrashesCount = lostGames / 12;

        double total = (headsetCrashesCount * headsetPrice)
                + (mouseCrashesCount * mousePrice) + (keyboardCrashesCount * keyboardPrice)
                + (displayCrashesCount * displayPrice);

        System.out.printf("Rage expenses: %.2f lv.", total);
    }
}
