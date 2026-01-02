import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void printData(Iterable<Person> people) {
        for (Person p : people) {
            System.out.printf(
                    "%s earns %.2f tenge%n",
                    p.toString(),
                    p.getPaymentAmount()
            );
        }
    }

    public static void main(String[] args) {

        Employee e1 = new Employee("John", "Lennon", "Singer", 27045.78);
        Employee e2 = new Employee("George", "Harrison", "Guitarist", 50000.00);

        Student s1 = new Student("Ringo", "Starr", 2.5);
        Student s2 = new Student("Paul", "McCartney", 3.8);

        ArrayList<Person> people = new ArrayList<>();
        people.add(e1);
        people.add(e2);
        people.add(s1);
        people.add(s2);

        Collections.sort(people);

        printData(people);
    }
}
