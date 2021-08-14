package Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(sc.nextLine());

        while (true) {
            String command = sc.nextLine();
            if (command.equals("end")) {
                break;
            }
            String[] commandData = command.split("\\s+");

            if (commandData[0].equals("Add")) {
                int passengers = Integer.parseInt(commandData[1]);
                list.add(passengers);
            } else {
                int passengerToAdd = Integer.parseInt(commandData[0]);
                for (int i = 0; i < list.size(); i++) {
                    int currWagon = list.get(i);
                    if (currWagon + passengerToAdd <= maxCapacity) {
                        list.set(i, currWagon + passengerToAdd);
                        break;
                    }
                }
            }
        }

        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
}
