import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Bot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //!dice - vurti ti zarche i ti kazva kolko ti se e padnalo---> gotovo
        //!divide - shte deli dve chisla
        //!multiply - shte umnojava dve qisla
        //!weather - shte ti kazva vremeto ------> gotovo
        //!game - igraete na kamuk nojica hartiq
        //!greetings - kazva ti zdrasti kak si
        //!bye - kazva ti chao
        System.out.println("Enter your name:");
        String name = sc.nextLine();

        while (true) {
            System.out.println("Enter command:");
            String command = sc.nextLine();

            if (command.equals("bye")) {
                System.out.printf("Have a nice day %s.I hope to" +
                        " see you again soon:)", name);
                break;
            }

            String[] tokens = command.split("\\s+");

            switch (tokens[0]) {
                case "dice":
                    int max = 6;
                    int min = 1;
                    int b = (int)(Math.random()*(max-min+1)+min);

                    if (b < 4) {
                        System.out.printf("%s rolled your dice a little slightly" +
                                " and that's why you rolled the %d. Other way harder:)%n", name, b);
                    } else {
                        System.out.printf("Well done %s so I want to rolled you %d.%n",name, b);
                    }
                    break;

                case "weather":
                    String[] arr={"Today it looks like it's " +
                            "going to rain, so it's not" +
                            " bad to get an umbrella", "Today will be a wonderful time for a" +
                            " beach. Apply sunscreen so you don't get burned", "Go out to make snowmen." +
                            " And get dressed a lot because it's cold"};
                    Random r=new Random();

                    int randomNumber=r.nextInt(arr.length);
                    System.out.println(arr[randomNumber]);
                    break;

                case "game":
                    String userInput = tokens[1];
                    String[] h = new String[] {
                            "rock",
                            "paper",
                            "scissors"
                    };

                    Random rnd = new Random();

                    break;
            }
        }
    }
}
