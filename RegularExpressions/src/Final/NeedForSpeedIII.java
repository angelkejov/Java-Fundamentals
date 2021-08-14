package Final;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;


public class NeedForSpeedIII {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in, StandardCharsets.UTF_8));

        int number = Integer.parseInt(reader.readLine());

        Map<String, Integer[]> map = new TreeMap<>();

        for (int i = 0; i < number; i++) {
            String[] split = reader.readLine().trim().split("\\|");
            String car = split[0];
            int mileage = Integer.parseInt(split[1]);
            int fuel = Integer.parseInt(split[2]);

            map.putIfAbsent(car, new Integer[2]);
            map.get(car)[0] = mileage;
            map.get(car)[1] = fuel;
        }
        String command = reader.readLine();

        while (!"Stop".equals(command)) {
            String[] commandParts = command.trim().split(" : ");
            String keyCommand = commandParts[0];
            String keyCar = commandParts[1];

            switch (keyCommand) {
                case "Drive":
                    int distance = Integer.parseInt(commandParts[2]);
                    int fuel = Integer.parseInt(commandParts[3]);

                    if (map.get(keyCar)[1] < fuel) {
                        System.out.println("Not enough fuel to make that ride");
                    } else {
                        map.get(keyCar)[0] += distance;
                        map.get(keyCar)[1] -= fuel;
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", keyCar, distance, fuel);
                        if (100000 < map.get(keyCar)[0]) {
                            map.remove(keyCar);
                            System.out.printf("Time to sell the %s!%n", keyCar);
                        }
                    }
                    break;
                case "Refuel":
                    int fuelRefuel = Integer.parseInt(commandParts[2]);

                    if (75 < fuelRefuel + map.get(keyCar)[1]) {
                        fuelRefuel = 75 - map.get(keyCar)[1];
                        map.get(keyCar)[1] = 75;
                    } else {
                        map.get(keyCar)[1] += fuelRefuel;
                    }
                    System.out.printf("%s refueled with %d liters%n", keyCar, fuelRefuel);
                    break;
                case "Revert":
                    int km = Integer.parseInt(commandParts[2]);

                    if (10000 <= map.get(keyCar)[0] - km) {
                        map.get(keyCar)[0] -= km;
                        System.out.printf("%s mileage decreased by %d kilometers%n", keyCar, km);
                    } else {
                        map.get(keyCar)[0] = 10000;
                    }
                    break;
                default:
                    break;
            }

            command = reader.readLine();
        }
        map
                .entrySet()
                .stream()
                .sorted((a, b) -> Integer.compare(b.getValue()[0], a.getValue()[0]))
                .forEach(entry -> System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n", entry.getKey(), entry.getValue()[0]
                        , entry.getValue()[1]));
    }
}
