package com.company;

import java.util.Scanner;

public class ConvertMetersToKilometers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int meters = Integer.parseInt(sc.nextLine());
        double kilometers = meters * 0.001;

        System.out.printf("%.2f", kilometers);
    }
}
