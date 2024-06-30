
public class MainProgram {

    public static void main(String[] args) {
        // you can test the program here

        // Organism organism = new Organism(20, 30);
        // System.out.println(organism);
        // organism.move(-10, 5);
        // System.out.println(organism);
        // organism.move(50, 20);
        // System.out.println(organism);

        // Herd herd = new Herd();
        // herd.addToHerd(new Organism(57, 66));
        // herd.addToHerd(new Organism(73, 56));
        // herd.addToHerd(new Organism(46, 52));
        // herd.addToHerd(new Organism(19, 107));
        // System.out.println(herd);

        Herd herd = new Herd();
        herd.addToHerd(new Organism(5, 10));
        herd.move(1, 0);
        System.out.println(herd.toString());
    }
}
