import java.util.Scanner;

public class UserInterface {

    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String commandStr = this.scanner.nextLine();
            // System.out.println();
            if (commandStr.equals("add")) {
                System.out.print("To add: ");
                String str = this.scanner.nextLine();
                // System.out.println();
                this.todoList.add(str);
                continue;

            } else if (commandStr.equals("remove")) {
                System.out.print("Which one is removed? ");
                int index = this.scanner.nextInt();
                // System.out.println();
                this.todoList.remove(index);
                continue;

            } else if (commandStr.equals("list")) {
                this.todoList.print();
                continue;
            } else if (commandStr.equals("stop")) {
                break;
            } else {
                System.out.println("Unknown command");
            }
        }
    }
}
