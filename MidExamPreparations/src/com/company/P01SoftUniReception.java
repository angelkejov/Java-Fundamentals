package com.company;

import java.util.Scanner;

public class P01SoftUniReception {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int employeeCap1 = Integer.parseInt(sc.nextLine());
        int employeeCap2 = Integer.parseInt(sc.nextLine());
        int employeeCap3 = Integer.parseInt(sc.nextLine());

        int studentsCount = Integer.parseInt(sc.nextLine());
        int studentsPerHour = employeeCap1 + employeeCap2 + employeeCap3;

        int neededHours = 0;

       while (studentsCount > 0) {
           studentsCount -= studentsPerHour;
           neededHours++;

           if (neededHours % 4 == 0) {
               neededHours++;
           }
       }
        System.out.printf("Time needed: %dh.", neededHours);
    }
}
