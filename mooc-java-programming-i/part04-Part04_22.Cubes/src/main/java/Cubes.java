

import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String st = scanner.nextLine();
        
            if (st.equals("end")) {
                break;
            }
        
            int number = Integer.valueOf(st);
            System.out.println(number*number*number);
        }

    }
}
