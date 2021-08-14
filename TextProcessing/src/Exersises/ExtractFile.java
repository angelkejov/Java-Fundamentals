package Exersises;

import java.util.Scanner;

public class ExtractFile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] parts = input.split("\\\\");
        String fullName = parts[parts.length - 1];
        String fileName = fullName.split("\\.")[0];
        String extension = fullName.split("\\.")[1];

        System.out.printf("File name: %s%n", fileName);
        System.out.printf("File extension: %s", extension);
    }
}
