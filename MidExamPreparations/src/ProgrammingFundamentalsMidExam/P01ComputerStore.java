package ProgrammingFundamentalsMidExam;

import java.util.Scanner;

public class P01ComputerStore {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String input = sc.nextLine();

            if (input.equals("regular")) {

                break;
            } else if (input.equals("special")) {

                break;
            } else {
                Double n = Double.parseDouble(sc.nextLine());

                Double withTaxes = 0.0;
                withTaxes += n;

            }
            System.out.println();
        }
    }
}
