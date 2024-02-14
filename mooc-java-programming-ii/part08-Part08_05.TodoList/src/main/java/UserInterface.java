import java.util.Scanner;

public class UserInterface {

    private TodoList toDoList;
    private Scanner scan;

    public UserInterface(TodoList todoList, Scanner scan) {
        this.toDoList = todoList;
        this.scan = scan;
    }

    public void start() {

        while (true) {
            System.out.print("Command: ");
            String cmd = this.scan.nextLine();
            System.out.println();
            if (cmd.equals("stop")) {
                break;
            }
            if (cmd.equals("add")) {
                System.out.print("To add: ");
                String task = this.scan.nextLine();
                System.out.println();
                this.toDoList.add(task);

            }else if(cmd.equals("remove")){
                System.out.print("Which one is removed? ");
                int idx = Integer.valueOf(scan.nextLine());
                System.out.println();
                this.toDoList.remove(idx);
            }else if(cmd.equals("list")){
                this.toDoList.print();
            }
        }

    }
}
