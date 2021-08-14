package exersices;

import java.util.Scanner;

public class Elevator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int p = Integer.parseInt(sc.nextLine());
        int courses = (int) Math.ceil((double) n / p);
        System.out.println(courses);
    }
}