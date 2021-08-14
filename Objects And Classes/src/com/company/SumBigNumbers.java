package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class SumBigNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger bi1 = new BigInteger(sc.nextLine());
        BigInteger bi2 = new BigInteger(sc.nextLine());

        BigInteger res = bi1.add(bi2);
        System.out.println(res);
    }
}
