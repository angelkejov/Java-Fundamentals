package FinaExamOriginal;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pattern pattern =
                Pattern.compile("U\\$(?<username>[A-Z][a-z]{2,})U\\$P@\\$(?<pass>[A-Za-z]{5,}[\\d]{1,})P@\\$");

        int n = Integer.parseInt(sc.nextLine());
        int counter = 0;
        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                System.out.println("Registration was successful");
                System.out.printf("Username: %s, Password: %s%n", matcher.group("username")
                        , matcher.group("pass"));
                counter++;
            } else {
                System.out.println("Invalid username or password");
            }
        }
        System.out.println("Successful registrations: " + counter);
    }
}
