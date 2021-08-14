package midExam;

import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double expiernced = Double.parseDouble(sc.nextLine());
        int battles = Integer.parseInt(sc.nextLine());

        double sum = 0;
        int count = 0;
        for (int i = 1; i <= battles; i++) {
            double exPerBattle = Double.parseDouble(sc.nextLine());

            count++;
           if (i % 3 == 0) {
               sum += exPerBattle + (exPerBattle * 0.15);
           } else if (i % 5 == 0) {
               sum += exPerBattle - (exPerBattle * 0.10);
           } else {
               sum += exPerBattle;
           }

           if (sum == expiernced) {
               break;
           }
        }

        if (sum >= expiernced) {
            System.out.printf("Player successfully collected his needed experience for %d battles.",
                    count);
        } else {
            double diff = Math.abs(expiernced - sum);
            System.out.printf("Player was not able to collect the needed experience, %.2f" +
                    " more needed.", diff);
        }
    }
}
