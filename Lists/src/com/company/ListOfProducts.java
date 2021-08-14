package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListOfProducts {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> listOfProducts = new ArrayList<>();

        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String products = sc.nextLine();
            listOfProducts.add(products);

        }

        Collections.sort(listOfProducts);
        for (int i = 0; i < listOfProducts.size(); i++) {
            System.out.printf("%d.%s%n", i + 1, listOfProducts.get(i));
        }
    }
}
