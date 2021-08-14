package com;

import com.sun.source.tree.Tree;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ThePianist {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        Map<String, String> composerPiece = new TreeMap<>();
        Map<String, String> keys = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            String[] split = input.split("\\|");
            String piece = split[0];
            String composer = split[1];
            String key = split[2];

            composerPiece.put(piece, composer);
            keys.put(piece, key);
        }

        while (true) {
            String commands = sc.nextLine();
            if (commands.equals("Stop")) {
                break;
            }
            String[] tokens = commands.split("\\|");
            String command = tokens[0];
            String piece = tokens[1];
            switch (command) {
                case "Add":
                    String composer = tokens[2];
                    String key = tokens[3];
                    if (!composerPiece.containsKey(piece)) {
                        composerPiece.put(piece, composer);
                        keys.put(piece, key);
                        System.out.printf("%s by %s in %s" +
                                " added to the collection!%n", piece, composer, key);
                    } else {
                        System.out.printf("%s is already in the collection!%n",
                                piece);
                    }
                    break;

                case "Remove":
                    if (composerPiece.containsKey(piece)) {
                        composerPiece.remove(piece);
                        keys.remove(piece);
                        System.out.printf("Successfully removed %s!%n", piece);
                    } else {
                        System.out.printf("Invalid operation! %s" +
                                " does not exist in the collection.%n", piece);
                    }
                    break;

                case "ChangeKey":
                    String newKey = tokens[2];
                    if (composerPiece.containsKey(piece)) {
                        keys.put(piece, newKey);
                        System.out.printf("Changed the key of %s " +
                                "to %s!%n", piece, newKey);
                    } else {
                        System.out.printf("Invalid operation! %s " +
                                "does not exist in the collection.%n", piece);
                    }
                    break;
            }
        }

        composerPiece.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(kvp -> System.out.printf("%s -> Composer: %s, Key: %s%n",
                        kvp.getKey(), kvp.getValue(), keys.get(kvp.getKey())));
    }
}
