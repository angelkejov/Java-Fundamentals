package ExamPreparation1;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class PlantDiscovery {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Map<String, Integer> nameRarity = new TreeMap<>();
        Map<String, Double> rating = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            String[] splitInput = input.split("<->");
            String plantName = splitInput[0];
            int rarity = Integer.parseInt(splitInput[1]);
            if (!nameRarity.containsKey(plantName)) {
                nameRarity.put(plantName, rarity);
            } else {
                int currRar = nameRarity.get(plantName);
                nameRarity.put(plantName, currRar + rarity);
            }
        }
        int counter = 0;
        while (true) {
            String commands = sc.nextLine();
            if (commands.equals("Exhibition")) {
                break;
            }
            String[] tokens = commands.split(" - ");
            String command = tokens[0];
            if ("Rate".equals(command)) {
                String plant = tokens[1];
                int rate = Integer.parseInt(tokens[2]);
                if (!rating.containsKey(plant)) {
                    counter++;
                    rating.put(plant, (double) rate);
                } else {
                    counter++;
                    double currRate = rating.get(plant);
                    rating.put(plant, currRate + rate);
                }
            }
        }
        System.out.println(counter);
        for (Map.Entry<String, Integer> entry : nameRarity.entrySet()) {
            System.out.printf("%s %d ", entry.getKey(),
                    entry.getValue());
            rating.forEach((key, value) -> System.out.printf(" %.2f%n", value));
        }
    }
}
