package Exersises;

import java.util.Scanner;

public class CaesarCipher {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        StringBuilder encryptedText = new StringBuilder();
        for (char symbol : text.toCharArray()) {
            char cryptedSymbol = (char) (symbol + 3);
            encryptedText.append(cryptedSymbol);
        }
        System.out.println(encryptedText);
    }
}
