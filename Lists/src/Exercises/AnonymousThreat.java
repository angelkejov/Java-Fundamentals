package Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> input = Arrays.stream(sc.nextLine().split("\\s+"))
                .collect(Collectors.toList());;

        while (true) {
            String command = sc.nextLine();

            if (command.equals("3:1")) {
                break;
            }

            String[] tokens = command.split(" ");
            if (tokens[0].equals("merge")) {
                int startIndex = Integer.parseInt(tokens[1]);
                int endIndex = Integer.parseInt(tokens[2]);

                if (startIndex < 0) {
                    startIndex = 0;
                }
                if (endIndex > input.size() - 1) {
                    endIndex = input.size() - 1;
                }

                for (int i = startIndex; i < endIndex; i++) {
                    String concat = input.get(startIndex) + input.get(startIndex + 1);
                    input.set(startIndex, concat);
                    input.remove(startIndex + 1);
                }
            } else if (tokens[0].equals("divide")) {
                int index = Integer.parseInt(tokens[1]);
                int partition = Integer.parseInt(tokens[2]);

                if (index >= 0 && index <= input.size() && partition >= 0 && partition <= 100)  {

                }
            }
        }

        for (String s : input) {
            System.out.print(s + " ");
        }
    }
}
