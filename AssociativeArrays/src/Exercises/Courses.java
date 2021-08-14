package Exercises;

import java.util.*;

public class Courses {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, ArrayList<String>> coursePerson = new LinkedHashMap<>();
        String line = scanner.nextLine();
        while (!line.equals("end")) {
            String[] tokens = line.split(" : ");
            if (!coursePerson.containsKey(tokens[0])) {
                coursePerson.put(tokens[0], new ArrayList<>());
                coursePerson.get(tokens[0]).add(tokens[1]);
            } else {
                coursePerson.get(tokens[0]).add(tokens[1]);
                Collections.sort(coursePerson.get(tokens[0]));
            }
            line = scanner.nextLine();
        }
        coursePerson.entrySet().stream().sorted((left, right) -> Integer.compare(right.getValue().size(), left.getValue().size()))
                .forEach(entry -> {
                    System.out.printf("%s: %d%n", entry.getKey(), entry.getValue().size());
                    for (int i = 0; i < entry.getValue().size(); i++) {
                        System.out.println("-- " + entry.getValue().get(i));
                    }
                });
    }
}
