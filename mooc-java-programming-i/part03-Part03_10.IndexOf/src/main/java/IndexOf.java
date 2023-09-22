
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        // implement here finding the indices of a number
        System.out.print("Search for? ");
        int src = Integer.valueOf(scanner.nextLine());
        int index = 0;
        while (index < list.size()) {
            int number = list.get(index);
            if (src == number) {
                System.out.println(src + " is at index " + index);
            }
            index = index + 1;
        }
    }
}
