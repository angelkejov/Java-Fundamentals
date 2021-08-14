package midExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> list = Arrays.stream(sc.nextLine().split("\\|"))
                .collect(Collectors.toList());

        while (true) {
            String command = sc.nextLine();
            if (command.equals("Done")) {
                break;
            }
            String[] tokens = command.split("\\s+");

            switch (tokens[0]) {
                case "Add":
                    String particle = tokens[1];
                    int index = Integer.parseInt(tokens[2]);

                    if (index <= list.size() - 1) {
                        list.add(index, particle);
                    }
                    break;

                case "Remove":
                    int i = Integer.parseInt(tokens[1]);
                    if (i <= list.size() - 1) {
                        list.remove(i);
                    }
                    break;

                case "Check":
                    if (tokens[1].equals("Even")) {
                        for (int j = 0; j < list.size(); j++) {
                            if (j % 2 == 0) {
                                System.out.print((list.get(j) + " ").substring(0, list.size()));
                            }
                        }
                        System.out.println();
                    } else if (tokens[1].equals("Odd")) {
                        for (int j = 0; j < list.size(); j++) {
                            if (j % 2 != 0) {
                                System.out.print(list.get(j) + " ");
                            }
                        }
                    }
                    break;
            }
        }
        System.out.println();
        System.out.print("You crafted ");
        for (int i = 0; i < list.size(); i++) {
            String h = list.get(i);
            String res = "";
            String result = res.concat(h);
            System.out.print(result + "");
        }
        System.out.print("!");
    }
}
