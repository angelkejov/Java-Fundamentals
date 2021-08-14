package Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Double> result = new LinkedHashMap<>();
        Map<String, Integer> f = new LinkedHashMap<>();
        double sum = 0;
        while (true) {
            String input = sc.nextLine();
            if (input.equals("buy")) {
                break;
            }
            String[] tokens = input.split("\\s+");
            String name = tokens[0];
            double price = Double.parseDouble(tokens[1]);
            int quantity = Integer.parseInt(tokens[2]);
            if (!result.containsKey(name)) {
                result.put(name, quantity * price);
                f.put(name, quantity);
            } else {
                f.put(name, f.get(name) + quantity);
                result.put(name, f.get(name) * price);
            }
        }

        result.forEach((e, i) ->
                System.out.printf("%s -> %.2f%n", e, i));
    }
}
