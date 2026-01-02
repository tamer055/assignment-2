public class Person implements Payable, Comparable<Person> {

    protected int id;
    protected String name;
    protected String surname;

    private static int counter = 1;

    public Person() {
        this.id = counter++;
    }

    public Person(String name, String surname) {
        this.id = counter++;
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPosition() {
        return "Student";
    }

    @Override
    public double getPaymentAmount() {
        return 0;
    }

    @Override
    public int compareTo(Person o) {
        return Double.compare(this.getPaymentAmount(), o.getPaymentAmount());
    }

    @Override
    public String toString() {
        return id + ". " + name + " " + surname;
    }
}
