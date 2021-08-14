package com.company;

import java.util.Scanner;

public class BackIn30Minutes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hours = Integer.parseInt(sc.nextLine());
        int minutes = Integer.parseInt(sc.nextLine()) + 30;

        if (minutes > 59) {
            hours++;

            if (hours > 23) {
                hours -= 24;
            }

            minutes -= 60;
        }

        if (minutes < 10) {
            System.out.println(hours+":"+"0"+minutes);
        } else {
            System.out.println(hours + ":" + minutes);
        }
    }

}
