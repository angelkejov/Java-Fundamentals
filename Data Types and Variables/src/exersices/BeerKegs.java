package exersices;

import java.util.Scanner;

public class BeerKegs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        double volume = 0;
        String biggerKeg = "";
        double biggerKegVolume = 0;

        for (int i = 0; i < n; i++) {
            String kegs = sc.nextLine();
            double r = Double.parseDouble(sc.nextLine());
            int height = Integer.parseInt(sc.nextLine());

            volume = Math.PI * r * r * height;

            if (biggerKegVolume < volume) {
                biggerKegVolume = volume;
                biggerKeg = kegs;
            }
        }

        System.out.println(biggerKeg);
    }
}


