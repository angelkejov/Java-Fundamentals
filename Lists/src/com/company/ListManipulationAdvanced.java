package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String[] input = scanner.nextLine().split(" ");

        while (!input[0].equals("end")){
            switch (input[0]){
                case "Contains":
                    if (numbers.contains(Integer.parseInt(input[1]))){
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;

                case "Print":
                    if (input[1].equals("even")){
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) % 2 == 0){
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                        System.out.println();
                    }
                    if (input[1].equals("odd")){
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) % 2 != 0){
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;

                case "Get":
                    int sum = 0;

                    for(int i = 0; i < numbers.size(); i++){
                        sum = sum + numbers.get(i);
                    }
                    System.out.println(sum);
                    break;

                case "Filter":
                    if (input[1].equals(">=")){
                        for(int index = 0; index >= Integer.parseInt(input[2]); index++){
                            System.out.print(numbers.get(index) + " ");
                        }
                    }
                    if (input[1].equals(">")){
                        for(int index = 0; index > Integer.parseInt(input[2]); index++){
                            System.out.print(numbers.get(index) + " ");
                        }
                    }
                    if (input[1].equals("<=")){
                        for(int index = 0; index <= Integer.parseInt(input[2]); index++){
                            System.out.print(numbers.get(index) + " ");
                        }
                    }
                    if (input[1].equals("<")){
                        for(int index = 0; index < Integer.parseInt(input[2]); index++){
                            System.out.print(numbers.get(index) + " ");
                        }
                    }
                    break;
            }
            input = scanner.nextLine().split(" ");
        }
        System.out.println();
    }
}
