package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String regex = "\\+359([ -])2(\\2)(\\d{3})(\\2)(\\d{4})\\b";

        String input = sc.nextLine();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        List<String> matchingPhones = new ArrayList<>();
        while (matcher.find()) {
            matchingPhones.add(matcher.group());
        }

        for (String phone : matchingPhones) {
            System.out.print(phone + ", ");
        }
    }
}
