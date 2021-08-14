package ExamPreparaion3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String regex = "(?<separator>[:*]{2})(?<word>[A-Z][a-z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);

        String input = sc.nextLine();
        int threshold = 1;
        for (int i = 0; i < input.length(); i++) {
            char currChar = input.charAt(i);
            if (Character.isDigit(currChar)) {
                int charParseInt = Integer.parseInt(String.valueOf(currChar));
                threshold *= charParseInt;
            }
        }
        Matcher matcher = pattern.matcher(input);
        int validCount = 0;
        List<String> validEmojis = new ArrayList<>();
        int sumOfAsciiCodes = 0;
        while (matcher.find()) {
            validCount++;
            String currWord = matcher.group("word");
            for (int i = 0; i < currWord.length(); i++) {
                char currChar = currWord.charAt(i);
                int ascii = (int) currChar;

                sumOfAsciiCodes += ascii;
                if (sumOfAsciiCodes >= threshold) {
                    validEmojis.add(currWord);
                    sumOfAsciiCodes = 0;
                }
            }
        }
        System.out.print("Cool threshold: " + threshold + "\n");
        System.out.printf("%d emojis found in the text. The cool ones are:%n", validCount);
        for (String emoji : validEmojis) {
            System.out.println(emoji);
        }
    }
}
