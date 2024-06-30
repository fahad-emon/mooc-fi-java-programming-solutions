
public class Main {

    public static void main(String[] args) {
        // You can test your program here
        // Item first = new Item("Rock", 5);
        // first.equals(new Item("Rock", 1));

        // BoxWithMaxWeight coffeeBox = new BoxWithMaxWeight(10);
        // coffeeBox.add(new Item("Saludo", 5));
        // coffeeBox.add(new Item("Pirkka", 5));
        // coffeeBox.add(new Item("Kopi Luwak", 5));

        // System.out.println(coffeeBox.isInBox(new Item("Saludo")));
        // System.out.println(coffeeBox.isInBox(new Item("Pirkka")));
        // System.out.println(coffeeBox.isInBox(new Item("Kopi Luwak")));

        // OneItemBox box = new OneItemBox();
        // box.add(new Item("Saludo", 5));
        // box.add(new Item("Pirkka", 5));

        // System.out.println(box.isInBox(new Item("Saludo")));
        // System.out.println(box.isInBox(new Item("Pirkka")));

        MisplacingBox box = new MisplacingBox();
        box.add(new Item("Saludo", 5));
        box.add(new Item("Pirkka", 5));

        System.out.println(box.isInBox(new Item("Saludo")));
        System.out.println(box.isInBox(new Item("Pirkka")));
    }
}
