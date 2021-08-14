package Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, String> map = new LinkedHashMap<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String command = sc.nextLine();
            String[] tokens = command.split("\\s+");
            switch (tokens[0]) {
                case "register":
                    String username = tokens[1];
                    String licensePlateNumber = tokens[2];
                    if (!map.containsKey(username)) {
                        map.put(username, licensePlateNumber);
                        System.out.printf("%s registered %s successfully%n",
                                username, licensePlateNumber);
                    } else {
                        System.out.printf("ERROR: already registered with plate number %s%n",
                                licensePlateNumber);
                    }
                    break;

                case "unregister":
                    String user = tokens[1];
                    if (!map.containsKey(user)) {
                        System.out.printf("ERROR: user %s not found%n", user);
                    } else {
                        map.remove(user);
                        System.out.printf("%s unregistered successfully%n", user);
                    }
                    break;
            }
        }

        map.forEach((e, i) ->
                System.out.printf("%s => %s%n", e, i));
    }
}
