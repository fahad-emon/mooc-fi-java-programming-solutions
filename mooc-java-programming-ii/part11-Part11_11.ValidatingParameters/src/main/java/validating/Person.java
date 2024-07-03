package validating;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        if (name == null || name.equals("") || name.length() > 40 ) {
            throw new IllegalArgumentException("Name is empty or contains more than 40 characters.");
        }

        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("The age should between 0 and 120.");
        }

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
