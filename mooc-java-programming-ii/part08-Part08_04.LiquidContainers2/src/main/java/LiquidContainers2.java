
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Container container1 = new Container();
        Container container2 = new Container();
        int mxCapacity = 100;

        while (true) {
            System.out.println("First: " + container1);
            System.out.println("Second: " + container2);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            System.out.println();

            String[] parts = input.split(" ");
            String cmd = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (cmd.equals("add")) {
                container1.add(amount);
            }else if(cmd.equals("move")){
                if(amount <= 0){
                    continue;
                }
                if(amount <= container1.contains()){
                    container1.remove(amount);
                    container2.add(amount);
                }else {
                    container2.add(container1.contains());
                    container1.remove(amount);
                }
            }else if(cmd.equals("remove")){
                container2.remove(amount);
            }

        }
    }

}
