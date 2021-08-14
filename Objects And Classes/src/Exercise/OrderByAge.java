package Exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class OrderByAge {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> people = new ArrayList<>();
        while (true) {
            String personalData = scanner.nextLine(); //"George 123456 20"
            if (personalData.equals("End")) {
                break;
            }

            String[] splitData = personalData.split("\\s+"); // ["George", "123456", "20"]
            String name = splitData[0];
            String id = splitData[1];
            int age = Integer.parseInt(splitData[2]);

            Person person = new Person(name, id, age);

            people.add(person);


        }
        people.sort(Comparator.comparing(Person::getAge));

        for (Person person : people) {
            System.out.println(person.toString());
        }
    }
    public static class Person {
        private String name;
        private int age;
        private String id;
        public Person(String name, String id, int age) {
            this.name = name;
            this.id = id;
            this.age = age;

        }
        public int getAge() {

            return age;

        }
        @Override
        public String toString() {
            return String.format("%s with ID: %s is %d years old.", this.name, this.id, this.age);
        }
    }
}


