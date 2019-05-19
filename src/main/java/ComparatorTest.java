import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ComparatorTest {
    public static void main(String[] args) {

        List<Person> persons = new LinkedList<>();
        Person person = new Person();
        person.setSurName("Tom Thumb");
        persons.add(person);
        person = new Person();
        person.setSurName("Humpty Dumpty");
        persons.add(person);
        person = new Person();
        person.setSurName("Jack Horner");
        persons.add(person);

        // Sort with Inner Class
        Collections.sort(persons, new Comparator() {

            public int compare(Person p1, Person p2) {
                return p1.getSurName().compareTo(p2.getSurName());
            }
        });

        System.out.println("=== Sorted SurName ===");
        for (Person p : persons) {
            p.printName();
        }

        Collections.shuffle(persons);

        // Use Lambda instead
        System.out.println("=== Sorted SurName ===");
         Collections.sort(persons, (Person p1, Person p2) -> {return p1.getSurName().compareTo(p2.getSurName());});

        for (Person p : persons) {
            p.printName();
        }


    }

    static class Person {
        private String surName;

        public String getSurName() {
            return surName;
        }

        public void setSurName(String surName) {
            this.surName = surName;
        }

        public void printName() {
            System.out.println(surName);
        }
    }
}
