package Exercises;

import java.util.*;
import java.util.stream.Collectors;

public class AppendArrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> numbers = Arrays.stream(sc.nextLine().split("\\|"))
                .collect(Collectors.toList());

        Collections.reverse(numbers);
        String printRes = numbers.toString().replaceAll("[\\]\\[,]", "").trim();
        printRes = printRes.replaceAll("\\s+", " ");

        System.out.println(printRes);
    }
}
