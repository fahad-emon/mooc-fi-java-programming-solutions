
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> numbers = new ArrayList<>();

        System.out.println("Input numbers, type \"end\" to stop.");

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            numbers.add(input);
        }

        System.out.println("\nPrint the average of the negative numbers or the positive numbers? (n/p)");
        String command = scanner.nextLine();
        if (command.equals("n")) {
            double average = numbers.stream()
            .mapToDouble(s -> Integer.valueOf(s))
            .filter(num -> num < 0)
            .average()
            .getAsDouble();
            System.out.println("Average of the negative numbers: " + average);
        } else if (command.equals("p")) {
            double average = numbers.stream()
            .mapToInt(s -> Integer.valueOf(s))
            .filter(num -> num > 0)
            .average()
            .getAsDouble();
            System.out.println("Average of the positive numbers: " + average);
        } else {
            System.out.println("Wrong command");
        }

    }
}
