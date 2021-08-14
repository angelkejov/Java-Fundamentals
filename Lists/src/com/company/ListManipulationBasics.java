package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (true) {
            String[] commands = sc.nextLine().split("\\s+");

            if (commands[0].equals("end")) {
                break;
            }

            switch (commands[0]) {
                case "Add":
                    int numberToAdd = Integer.parseInt(commands[1]);
                    numbers.add(numberToAdd);
                    break;

                case "Remove":
                    int numberToDelete = Integer.parseInt(commands[1]);
                    numbers.removeAll(Collections.singletonList(numberToDelete));
                    break;

                case "RemoveAt":
                    int index = Integer.parseInt(commands[1]);
                    numbers.remove(index);
                    break;

                case "Insert":
                    int number = Integer.parseInt(commands[1]);
                    int index1 = Integer.parseInt(commands[2]);

                    numbers.add(index1, number);
                    break;
            }
        }

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
