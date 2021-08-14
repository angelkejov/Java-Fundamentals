package Exersises;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class VendingMachine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        double money = 0.0;

        Dictionary<String, Double> dic = new Hashtable<String, Double>();

        dic.put("Nuts", 2.0);
        dic.put("Water", 0.7);
        dic.put("Crisps", 1.5);
        dic.put("Soda", 0.8);
        dic.put("Coke", 1.0);


        while (true) {

            String input = scanner.nextLine();
            if (input.equals("Start")) break;
            double in = Double.parseDouble(input);
            if (in != 0.1 && in != 0.2 && in != 0.5 && in != 1.0 && in != 2.0) System.out.printf("Cannot accept %.2f \n", in);
            else money+= in;
        }

        while (true) {

            Enumeration enu = dic.keys();

            String input = scanner.nextLine();

            if (input.equals("End")) break;

            if (((Hashtable<String, Double>) dic).containsKey( input ) == false) System.out.println("Invalid product");

            while (enu.hasMoreElements()) {
                str = (String) enu.nextElement();
                if (str.equals(input) && money - dic.get(str) >= 0) {
                    money -= dic.get( str );
                    System.out.printf( "Purchased %s \n", input );
                } else if (str.equals(input) && money - dic.get(str)  < 0) {
                    System.out.println("Sorry, not enough money");
                }

            }

        }

        System.out.printf("Change: %.2f", money);

    }
}
