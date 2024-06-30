
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.print("Input the name of the book, empty stops: ");
            String name = scanner.nextLine();
            if (name.equals("")) {
                break;
            }
            // System.out.println();
            System.out.print("Input the age recommendation: ");
            int recommendedAge = Integer.valueOf(scanner.nextLine());
            System.out.println();
            books.add(new Book(name, recommendedAge));
        }
        System.out.println("\n" + books.size() + " books in total.\n\nBooks:");
        Comparator<Book> comparator = Comparator
                .comparing(Book::getRecommendedAge)
                .thenComparing(Book::getName);
        Collections.sort(books,comparator);
        books.stream().forEach(book -> System.out.println(book));

    }

}
