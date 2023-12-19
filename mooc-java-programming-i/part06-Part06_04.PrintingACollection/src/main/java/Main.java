
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        SimpleCollection j = new SimpleCollection("characters");
        System.out.println(j);

        System.out.println();

        j.add("magneto");
        System.out.println(j);

        System.out.println();

        j.add("mystique");
        System.out.println(j);

        System.out.println();

        j.add("phoenix");
        System.out.println(j);

        SimpleCollection s = new SimpleCollection("characters");
        System.out.println(s);

        System.out.println();

        s.add("magneto");
        System.out.println(s);

        System.out.println();

        s.add("mystique");
        System.out.println(s);

        System.out.println();

        s.add("phoenix");
        System.out.println(s);

    }
}
