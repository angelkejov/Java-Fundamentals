package com.company;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ArrayModifier {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (true) {
            String command = sc.nextLine();
            if (command.equals("end")) {
                break;
            }
            String[] tokens = command.split("\\s+");

            switch (tokens[0]) {
                case "swap":
                    int index1 = Integer.parseInt(tokens[1]);
                    int index2 = Integer.parseInt(tokens[2]);

                    int elementOnIndex2 = numbers.get(index2);
                    int elementOnIndex1 = numbers.get(index1);
                    numbers.set(index1, elementOnIndex2);
                    numbers.set(index2, elementOnIndex1);
                    break;

                case "multiply":
                    int firstIndex = Integer.parseInt(tokens[1]);
                    int secondIndex = Integer.parseInt(tokens[2]);

                    int el1 = numbers.get(firstIndex);
                    int el2 = numbers.get(secondIndex);
                    int multiply = el1 * el2;
                    numbers.set(firstIndex, multiply);
                    break;

                case "decrease":
                    for (int i = 0; i < numbers.size(); i++) {
                        int currEl = numbers.get(i);
                        int currElDecreaseOne = currEl - 1;
                        numbers.set(i, currElDecreaseOne);
                    }
                    break;
            }
        }
        for (int i = 0; i <numbers.size() ; i++) {
            System.out.print(numbers.get(i));
            if (i < numbers.size() - 1){
                System.out.print(", ");
            }
        }
    }
}
