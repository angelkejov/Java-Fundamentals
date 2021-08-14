package com.company;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Double> inpNumbers1 = Arrays.stream(sc.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());
        List<Double> inpNumbers2 = Arrays.stream(sc.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());
        List<Double> outputNumbers = new ArrayList<>();

        if (inpNumbers1.size() < inpNumbers2.size()) {
            for (int i = 0; i < inpNumbers1.size(); i++) {
                outputNumbers.add(inpNumbers1.get(i));
                outputNumbers.add(inpNumbers2.get(i));
            }

            for (int i = inpNumbers1.size(); i < inpNumbers2.size(); i++) {
                outputNumbers.add(inpNumbers2.get(i));
            }
        } else if (inpNumbers2.size() < inpNumbers1.size()) {
            for (int i = 0; i < inpNumbers2.size(); i++) {
                outputNumbers.add(inpNumbers1.get(i));
                outputNumbers.add(inpNumbers2.get(i));
            }

            for (int i = inpNumbers2.size(); i < inpNumbers1.size(); i++) {
                outputNumbers.add(inpNumbers1.get(i));
            }
        } else {
            for (int i = 0; i < inpNumbers1.size(); i++) {
                outputNumbers.add(inpNumbers1.get(i));
                outputNumbers.add(inpNumbers2.get(i));
            }
        }

        for (int j = 0; j < outputNumbers.size(); j++) {
            System.out.print(new DecimalFormat("0.###").format(outputNumbers.get(j)) + " ");

        }
    }
}
