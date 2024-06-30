
public class Main {

    public static void main(String[] args) {
        // you can test how your classes work here
        // Cat cat = new Cat();
        // cat.purr();
        // cat.eat();

        // Cat garfield = new Cat("Garfield");
        // garfield.purr();

        NoiseCapable dog = new Dog();
        dog.makeNoise();

        NoiseCapable cat = new Cat("Garfield");
        cat.makeNoise();
        Cat c = (Cat) cat;
        c.purr();

    }

}
