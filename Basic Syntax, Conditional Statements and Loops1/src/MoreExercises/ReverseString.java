package MoreExercises;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        StringBuffer sb = new StringBuffer(scn.nextLine());
        System.out.println(sb.reverse());
    }
}
