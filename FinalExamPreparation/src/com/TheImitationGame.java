package com;

import java.util.Scanner;

public class TheImitationGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String message = sc.nextLine();

        while (true) {
            String input = sc.nextLine();
            if (input.equals("Decode")) {
                break;
            }
            String[] tokens = input.split("\\|");

            switch (tokens[0]) {
                case "Move":
                    int n = Integer.parseInt(tokens[1]);
                    String str = message.substring(0, n);
                    message = message.replace(str, "");
                    message = message.concat(str);
                    break;

                case "Insert":
                    int index = Integer.parseInt(tokens[1]);
                    String value = tokens[2];
                    message = addChar(message, value, index);
                    break;

                case "ChangeAll":
                    String substring = tokens[1];
                    String replacement = tokens[2];
                    if (message.contains(substring)) {
                        message = message.replaceAll(substring, replacement);
                    }
                    break;
            }
        }
        System.out.println("The decrypted message is: " + message);
    }

    public static String addChar(String str, String ch, int position) {
        return str.substring(0, position) + ch + str.substring(position);
    }
}
