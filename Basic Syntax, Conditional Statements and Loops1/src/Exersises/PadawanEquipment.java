package Exersises;

import java.util.Scanner;

public class PadawanEquipment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double lightsaberPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());
        double lightSMore= Math.ceil(students*0.10);
        double lightSSum = (students+lightSMore) * lightsaberPrice;
        double robesSum = robePrice*students;
        double beltsDiscount = students - (students/6);// ако премахнем грешката с *1,0 закръгля надолу и
        // при по-малко от 6 ученика не дава точен резултат
        double beltsSum = beltPrice*beltsDiscount;

        double totalSum =   lightSSum + robesSum + beltsSum;

        if(totalSum<=money){
            System.out.printf("The money is enough - it would cost %.2flv.",totalSum);
        }else {
            System.out.printf("George Lucas will need %.2flv more.", totalSum-money);
        }

    }
}
