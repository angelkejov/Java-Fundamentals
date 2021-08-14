package ExamPreparation1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String regex = "([=\\/])([A-Z][A-Za-z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);

        String places = sc.nextLine();
        Matcher matcher = pattern.matcher(places);
        List<String> validDestination = new ArrayList<>();

        int travelPoints = 0;
        while (matcher.find()) {
            validDestination.add(matcher.group(2));
            travelPoints += matcher.group(2).length();
        }
        String destinations = String.join(", ", validDestination);
        System.out.println("Destinations: " + destinations);
        System.out.println("Travel Points: " + travelPoints);
    }
}
