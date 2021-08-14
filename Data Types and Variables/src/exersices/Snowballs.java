package exersices;

import java.util.Scanner;

public class Snowballs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int maxSnowballSnow = Integer.MIN_VALUE;
        int maxSnowballTime = Integer.MIN_VALUE;
        int maxSnowballQuality = Integer.MIN_VALUE;
        double maxSnowballValue  = Double.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int snowballSnow = Integer.parseInt(sc.nextLine());
            int snowballTime = Integer.parseInt(sc.nextLine());
            int snowballQuality = Integer.parseInt(sc.nextLine());

            double snowballValue = Math.pow((snowballSnow / snowballTime), snowballQuality);

            if(maxSnowballValue < snowballValue) {
                maxSnowballValue = snowballValue;
                maxSnowballSnow = snowballSnow;
                maxSnowballTime = snowballTime;
                maxSnowballQuality = snowballQuality;
            }
        }

        System.out.printf("%d : %d = %.0f (%d)", maxSnowballSnow, maxSnowballTime, maxSnowballValue, maxSnowballQuality);
    }
}
