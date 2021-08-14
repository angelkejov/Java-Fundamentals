package Exercise.AdvertisementMessage;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        String[] phrases = {"Excellent product.", "Such a great product.",
                "I always use that product.", "Best product of its category.",
                "Exceptional product.", "I can’t live without this product."};

        String[] events = {"Now I feel good.", "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome."
                , "Try it yourself, I am very satisfied.", "I feel great!"};

        String[] authors = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};

        String[] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        Random randomPhrases = new Random();
        Random randomEvents = new Random();
        Random randomAuthors = new Random();
        Random randomCities = new Random();

        for (int i = 0; i < n; i++) {
            String random1 = (phrases[new Random().nextInt(phrases.length)]);
            String random2 = (events[new Random().nextInt(events.length)]);
            String random3 = (authors[new Random().nextInt(authors.length)]);
            String random4 = (cities[new Random().nextInt(cities.length)]);
            System.out.printf("%s%s%s-%s%n", random1, random2, random3, random4);
        }
    }
}
