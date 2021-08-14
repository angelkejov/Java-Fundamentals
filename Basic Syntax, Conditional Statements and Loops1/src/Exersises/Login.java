package Exersises;


import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tries = 3;
        String user = sc.nextLine();
        String password = reverse(user);
        String input = sc.nextLine();
        while (true) {
            if (input.equals(password)) {
                System.out.printf("User %s logged in.", user);
                break;
            } else if (tries == 0) {
                System.out.printf("User %s blocked!", user);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            tries--;
            input = sc.nextLine();
        }
    }
    public static String reverse(String input) {
        if (input == null) {
            return input;
        }
        String output = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            output = output + input.charAt(i);
        }
        return output;
    }

}
