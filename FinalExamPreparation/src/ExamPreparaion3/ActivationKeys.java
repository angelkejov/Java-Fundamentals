package ExamPreparaion3;

import java.util.Scanner;

public class ActivationKeys {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String builder = sc.nextLine();
        while (true) {
            String command = sc.nextLine();
            if (command.equals("Generate")) {
                System.out.println("Your activation key is: " + builder);
                break;
            }
            String[] tokens = command.split(">>>");
            switch (tokens[0]) {
                case "Flip":
                    String upperLower = tokens[1];
                    if (upperLower.equals("Upper")) {
                        int startIndex = Integer.parseInt(tokens[2]);
                        int endIndex = Integer.parseInt(tokens[3]);
                        StringBuilder sb = new StringBuilder();
                        String res = builder.substring(startIndex, endIndex);
                        res = res.toUpperCase();
                        sb.append(builder);
                        sb.replace(startIndex, endIndex, res);
                        builder = sb.toString();
                        System.out.println(builder );
                    }
                    if (upperLower.equals("Lower")) {
                        int startIndex = Integer.parseInt(tokens[2]);
                        int endIndex = Integer.parseInt(tokens[3]);
                        StringBuilder sb1 = new StringBuilder();
                        String res = builder.substring(startIndex, endIndex);
                        res = res.toLowerCase();
                        sb1.append(builder);
                        sb1.replace(startIndex, endIndex, res);
                        builder = sb1.toString();
                        System.out.println(builder);
                    }
                    break;
                case "Slice":
                    int start = Integer.parseInt(tokens[1]);
                    int end = Integer.parseInt(tokens[2]);
                    String substringToRemove = builder.substring(start, end);
                    builder = builder.replace(substringToRemove, "");
                    System.out.println(builder);
                    break;
                case "Contains":
                    String substring = tokens[1];
                    if (builder.contains(substring)) {
                        System.out.println(builder + " contains " + substring);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
            }
        }
    }
}
