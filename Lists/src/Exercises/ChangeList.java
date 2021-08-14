package Exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (true) {
            String command = sc.nextLine();
            if (command.equals("end")) {
                break;
            }

            String[] tokens = command.split(" ");

            if (tokens[0].equals("Delete")) {
                int element = Integer.parseInt(tokens[1]);
                list.removeAll(Collections.singleton(element));
            } else if (tokens[0].equals("Insert")) {
                int element = Integer.parseInt(tokens[1]);
                int position = Integer.parseInt(tokens[2]);
                list.add(position, element);
            }
        }

        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
}
