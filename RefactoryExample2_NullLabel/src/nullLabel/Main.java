package nullLabel;
public class Main {
    public static void main(String[] args) {
        Person[] people = {
            new Person(new Label("Alice"), new Label("alice@example.com")),
            new Person(new Label("Bob")),
            new Person(new Label("Charlie"), new Label("Charlie@example.com")),
        };

        for (Person p : people) {
            System.out.println(p.toString());
            p.display();
            System.out.println("");
        }
    }
}
