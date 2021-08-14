package FinaExamOriginal;

import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        while (true) {
            String commands = sc.nextLine();
            if (commands.equals("Registration")) {
                break;
            }
            String[] tokens = commands.split("\\s+");
            switch (tokens[0]) {
                case "Letters":
                    String upOrLow = tokens[1];
                    if (upOrLow.equals("Lower")) {
                        input = input.toLowerCase();
                    } else if (upOrLow.equals("Upper")) {
                        input = input.toUpperCase();
                    }
                    System.out.println(input);
                    break;

                case "Reverse":
                    StringBuilder s = new StringBuilder();
                    int startIndex = Integer.parseInt(tokens[1]);
                    int endIndex = Integer.parseInt(tokens[2]);
                    String str = input.substring(startIndex, endIndex + 1);

                    if (startIndex >= 0 && startIndex < input.length()
                            && endIndex >= 0 && endIndex < input.length()) {
                        for (int i = 0; i < str.length(); i++) {
                            char currChar = str.charAt(i);
                            s.append(currChar);
                        }
                    }
                        s.reverse();
                        System.out.println(s);
                    break;

                case "Substring":
                    String substring = tokens[1];
                    if (input.contains(substring)) {
                        input = input.replace(substring, "");
                        System.out.println(input);
                    } else {
                        System.out.printf("The username %s doesn't contain %s.%n",
                                input, substring);
                    }
                    break;

                case "Replace":
                    String ch = tokens[1];
                    input = input.replaceAll(ch, "-");
                    System.out.println(input);
                    break;

                case "IsValid":
                    String charr = tokens[1];
                    if (input.contains(charr)) {
                        System.out.println("Valid username.");
                    } else {
                        System.out.printf("%s must be contained in your username.%n",
                                charr);
                    }
                    break;
            }
        }
    }
}
