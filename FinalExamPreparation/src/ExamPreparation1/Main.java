package ExamPreparation1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String stops = sc.nextLine();
        while (true) {
            String commands = sc.nextLine();
            if (commands.equals("Travel")) {
                System.out.print("Ready for world tour! Planned stops: " + stops);
                break;
            }
            String[] tokens = commands.split(":");
            String command = tokens[0];
            switch (command) {
                case "Add Stop":
                    int index = Integer.parseInt(tokens[1]);
                    String string = tokens[2];
                    if (isValidIndex(index, string)) {
                        stops = insertString(stops, string, index);
                    }
                    break;
                case "Remove Stop":
                    int startIndex = Integer.parseInt(tokens[1]);
                    int endIndex = Integer.parseInt(tokens[2]);
                    if (isValidIndex(startIndex, stops) && isValidIndex(endIndex, stops)) {
                        String remove = stops.substring(startIndex, endIndex + 1);
                        stops = stops.replace(remove, "");
                    }
                    break;
                case "Switch":
                    String oldString = tokens[1];
                    String newString = tokens[2];
                    if (stops.contains(oldString)) {
                        stops = stops.replace(oldString, newString);
                    }
                    break;
            }
            System.out.println(stops);
        }
    }
    private static boolean isValidIndex(int index, String str) {
        boolean isValid;
        isValid = index < str.length() || index > 0;
        return isValid;
    }

    public static String insertString(String originalString, String stringToBeInserted,
                                      int index) {
        String newString = originalString.substring(0, index)
                + stringToBeInserted
                + originalString.substring(index);
        return newString;
    }
}
