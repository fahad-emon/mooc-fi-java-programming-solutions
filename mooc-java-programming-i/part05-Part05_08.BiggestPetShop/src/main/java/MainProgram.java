
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Pet hulda = new Pet("Hulda", "Golden retriever");
        // Person leo = new Person("Leo", hulda);
        Pet lucy = new Pet("Lucy", "golden retriever");
        Person leo = new Person("Leo", lucy);

        System.out.println(leo);
    }
}
