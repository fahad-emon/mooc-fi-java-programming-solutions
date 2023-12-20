import java.util.Random;
import java.util.Scanner;

public class UserInterface {

    private JokeManager jokemanager;
    private Scanner scanner;

    public UserInterface(JokeManager jokeManager, Scanner scanner) {
        this.jokemanager = jokeManager;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            printCmd();
            String command = scanner.nextLine();

            if (command.equals("X")) {
                break;
            }
            if (command.equals("1")) {
                System.out.println("Write the joke to be added:");
                String joke = scanner.nextLine();
                this.jokemanager.addJoke(joke);
            } else if (command.equals("2")) {
                System.out.println("Drawing a joke.");
                System.out.println(this.jokemanager.drawJoke());
            }else if (command.equals("3")) {
                System.out.println("Printing the jokes.");
                this.jokemanager.printJokes();
            }
        }
    }

    public void printCmd() {
        System.out.println("Commands:");
        System.out.println(" 1 - add a joke");
        System.out.println(" 2 - draw a joke");
        System.out.println(" 3 - list jokes");
        System.out.println(" X - stop");
    }
}
