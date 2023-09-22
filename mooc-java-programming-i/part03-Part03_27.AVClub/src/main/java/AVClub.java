
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* String input = scanner.nextLine();

        if (input.equals("")) {
            return;
        }

        String[] text = input.split(" ");
      
        while (!(input.equals("")) ) {

            for (int i = 0; i < text.length; i++) {
                if (text[i].contains("av")) {
                    System.out.println(text[i]);
                }

            }
            input = scanner.nextLine();
            text = input.split(" ");
            
        } */
        while (true) {
        String input = scanner.nextLine();
        if (input.equals("")) {
            break;
        }
        String[] text = input.split(" "); 
         for (int i = 0; i < text.length; i++) {
                if (text[i].contains("av")) {
                    System.out.println(text[i]);
                }
            }
        }

    }
}
