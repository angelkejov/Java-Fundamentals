package Final;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String regex = "(@|#)(?<one>[A-Za-z]{3,})(\\1)(\\1)(?<two>[A-Za-z]{3,})(\\1)";
        String input = sc.nextLine();
        Map<String, String> mirror = new LinkedHashMap<>();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        int count = 0;
        while (matcher.find()) {
            count++;
            String one = matcher.group("one");
            String two = matcher.group("two");
            two = reverse(two);
            if (one.equals(two)) {
                mirror.put(matcher.group("one"), matcher.group("two"));
            }
        }
        if (count > 0) {
            System.out.println(count + " word pairs found!");
        } else {
            System.out.println("No word pairs found!");
        }
        if (mirror.size() <= 0) {
            System.out.println("No mirror words!");
        } else {
            System.out.println("The mirror words are:");
        }
        for (Map.Entry<String, String> entry : mirror.entrySet()) {
            System.out.printf("%s <=> %s, ", entry.getKey(), entry.getValue());
        }
    }

    private static String reverse(String input) {
        StringBuilder builder = new StringBuilder();
        builder.append(input);
        builder.reverse();
        return builder.toString();
    }
}
