
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    public boolean equals (Object compared){
        if(this == compared){
            return true;
        }

        if(!(compared instanceof Person)){
            return false;
        }

        Person comPerson = (Person) compared;
        if( this.name.equals(comPerson.name) &&
            this.birthday.equals(comPerson.birthday) &&
            this.height == comPerson.height &&
            this.weight == comPerson.weight){
            return true;
        }
        return false;
    }
}
