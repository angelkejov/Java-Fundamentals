package ExamPreparation2;

import java.util.Scanner;

public class PasswordReset {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        while (true) {
            String commands = sc.nextLine();
            if (commands.equals("Done")) {
                System.out.println("Your password is: " + input);
                break;
            }
            String[] tokens = commands.split("\\s+");
            String command = tokens[0];
            switch (command) {
                case "TakeOdd":
                    StringBuilder builder = new StringBuilder();
                    for (int i = 0; i < input.length(); i++) {
                        char currChar = input.charAt(i);
                        if (i % 2 != 0) {
                            builder.append(currChar);
                        }
                    }
                    input = builder.toString();
                    System.out.println(input);
                    break;

                case "Cut":
                    int index = Integer.parseInt(tokens[1]);
                    int length = Integer.parseInt(tokens[2]);

                    String firstPart = input.substring(0, index);
                    String secondPart = input.substring(index + length);

                    String subtring = firstPart.concat(secondPart);
                    input = subtring;
                    System.out.println(input);
                    break;

                case "Substitute":
                    String firstSub = tokens[1];
                    String secondSub = tokens[2];

                    if (input.contains(firstSub)) {
                        input = input.replace(firstSub, secondSub);
                        System.out.println(input);
                    } else {
                        System.out.println("Nothing to replace!");
                    }
                    break;
            }
        }
    }
}
