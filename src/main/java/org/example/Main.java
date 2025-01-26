package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Comparator<Person> nameComparator = Comparator.comparing(Person::getName);
        Comparator<Person> ageComparator = Comparator.comparingInt(Person::getAge);

        TreeSet<Person> peopleByName = new TreeSet<>(nameComparator);
        TreeSet<Person> peopleByAge = new TreeSet<>(ageComparator);

        Person Andrei = new Person("Andrei", 20);
        Person Cristina = new Person("Cristina", 15);
        Person Gaby = new Person("Gaby", 36);

        peopleByName.add(Andrei);
        peopleByName.add(Cristina);
        peopleByName.add(Gaby);

        peopleByAge.add(Andrei);
        peopleByAge.add(Cristina);
        peopleByAge.add(Gaby);

        System.out.println("People sorted by name:");
        for (Person person : peopleByName) {
            System.out.println(person);
        }

        System.out.println("\nPeople sorted by age:");
        for (Person person : peopleByAge) {
            System.out.println(person);
        }

        Country Romania = new Country("Romania");
        Country Moldova = new Country("Moldova");

        Address address1 = new Address("123 Eminescu Street", Romania);
        Address address2 = new Address("40 Cricova Street", Moldova);

        Hobby cycling = new Hobby("Cycling", 3, Arrays.asList(address1, address2));
        Hobby swimming = new Hobby("Swimming", 2, Collections.singletonList(address1));

        Map<Person, List<Hobby>> hobbyMap = new HashMap<>();
        hobbyMap.put(Andrei, Arrays.asList(cycling, swimming));
        hobbyMap.put(Cristina, Collections.singletonList(swimming));

        System.out.println("\nHobbies and locations for Andrei:");
        for (Hobby hobby : hobbyMap.get(Andrei)) {
            System.out.println("Hobby: " + hobby.getName());
            for (Address address : hobby.getAddresses()) {
                System.out.println("  Practiced at: " + address + ", " + address.getCountry());
            }
        }
    }
}