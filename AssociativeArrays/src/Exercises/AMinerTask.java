package Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {

    public static void main(String[] args) {
        LinkedHashMap<String, Integer> resources  = new LinkedHashMap<>();
        String resource = " ";
        Scanner scanner = new Scanner(System.in);
        while (!resource.equals("stop"))
        {
            resource = scanner.nextLine();
            if (!resource.equals("stop"))
            {
                if (!resources.containsKey(resource))
                { resources.put(resource, 0);}
                int quantity = Integer.parseInt(scanner.nextLine());
                resources.put(resource, resources.get(resource) + quantity);
            }
        }
        for (Map.Entry<String, Integer> entry : resources.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.printf("%s -> %d%n",key, value);
        }
    }
}
