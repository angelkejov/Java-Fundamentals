package com.company;

import java.util.Scanner;

public class CalculateRectangleArea {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double width = Double.parseDouble(sc.nextLine());
        double height = Double.parseDouble(sc.nextLine());
        double area = areaOfRectangle(width, height);
        System.out.printf("%.0f", area);
    }

    private static double areaOfRectangle(double width, double height) {
        return width * height;
    }
}
