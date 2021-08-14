package midExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> priceRating = Arrays.stream(sc.nextLine().split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int entryPoint = Integer.parseInt(sc.nextLine());
        String typeOfItems = sc.nextLine();

        int sumLeft = 0;
        int sumRight = 0;

        for (int i = 0; i < priceRating.size() / 2; i++) {
            sumLeft += priceRating.get(i);
        }

        for (int i = priceRating.size() / 2; i < priceRating.size(); i++) {
            sumRight += priceRating.get(i);
        }
        if (typeOfItems.equals("cheap")) {
            if (sumLeft > sumRight) {
                System.out.printf("Right - %d", sumRight);
            } else if (sumLeft < sumRight) {
                System.out.printf("Left - %d", sumLeft);
            }
        } else if (typeOfItems.equals("expensive")) {
            if (sumLeft > sumRight) {
                System.out.printf("Left - %d", sumLeft);
            } else if (sumLeft < sumRight) {
                System.out.printf("Right - %d", sumRight);
            }
        }
    }
}
