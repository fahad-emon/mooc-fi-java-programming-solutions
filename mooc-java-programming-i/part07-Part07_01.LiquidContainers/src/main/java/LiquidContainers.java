
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int containers1 = 0;
        int containers2 = 0;
        int maxCapacity = 100;

        while (true) {

            System.out.println("First: " + containers1 + "/" + maxCapacity);
            System.out.println("Second: " + containers2 + "/" + maxCapacity);

            String input = scan.nextLine();
            System.out.println();
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            // add
            if (command.equals("add")) {
                if (containers1 + amount <= maxCapacity && amount > 0) {
                    containers1 += amount;
                }else{
                    containers1 = maxCapacity;
                }
            }
            // move 
            if(command.equals("move")){
                if(amount <= containers1 && amount <= maxCapacity && amount > 0){
                    containers1 -= amount;
                    if (amount + containers2 <= maxCapacity ) {
                        containers2 += amount;
                    }else{
                        containers2 = maxCapacity;
                    }
                }else{
                    if (containers1 + containers2 <= maxCapacity ) {
                        containers2 += containers1;
                    }else{
                        containers2 = maxCapacity;
                    }
                    containers1 = 0;
                }
            }
            // remove
            if (command.equals("remove")) {
                if (amount <= maxCapacity && containers2 > amount && amount > 0) {
                    containers2 -= amount;
                }else{
                    containers2 = 0;
                }
            }
        }
    }

}
