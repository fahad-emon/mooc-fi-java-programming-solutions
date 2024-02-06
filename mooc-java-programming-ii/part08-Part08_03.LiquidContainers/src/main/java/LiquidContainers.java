
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int mxCapacity = 100;
        int LqContainer1 = 0;
        int LqContainer2 = 0;

        while (true) {
            System.out.println();
            System.out.println("First: " + LqContainer1 + "/" + mxCapacity);
            System.out.println("Second: " + LqContainer2 + "/" + mxCapacity);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String cmd = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (cmd.equals("add")) {
                if (amount < 0) {
                    continue;
                }
                if (LqContainer1 + amount > mxCapacity) {
                    LqContainer1 = mxCapacity;
                    continue;
                }
                LqContainer1 += amount;

            } else if (cmd.equals("move")) {
                if (amount < 0) {
                    continue;
                }
                if (amount >= LqContainer1) {
                    if (LqContainer2 + LqContainer1 > mxCapacity) {
                        LqContainer2 = mxCapacity;
                    } else {
                        LqContainer2 += LqContainer1;
                    }
                    LqContainer1 = 0;
                } else {
                    if (LqContainer2 + amount > mxCapacity) {
                        LqContainer2 = mxCapacity;
                    } else {
                        LqContainer2 += amount;
                    }
                    LqContainer1 -= amount;
                }
            } else if (cmd.equals("remove")) {
                if (amount < 0) {
                    continue;
                }
                if (amount > LqContainer2 || amount > mxCapacity) {
                    LqContainer2 = 0;
                    continue;
                }
                LqContainer2 -= amount;
            }

        }
    }

}
