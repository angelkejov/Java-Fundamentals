package exersices;

import java.util.Scanner;

public class PokeMon {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pokePower = Integer.parseInt(sc.nextLine());
        int distance = Integer.parseInt(sc.nextLine());
        int exhaustionFactor = Integer.parseInt(sc.nextLine());

        int currentPokePower = pokePower;
        int targetsCount = 0;
        while (currentPokePower >= distance) {
            currentPokePower -= distance;
            targetsCount++;

            if (currentPokePower == pokePower * 0.5 && exhaustionFactor != 0)
            {
                currentPokePower /= exhaustionFactor;
            }
        }

        System.out.println(currentPokePower);
        System.out.println(targetsCount);
    }
}
