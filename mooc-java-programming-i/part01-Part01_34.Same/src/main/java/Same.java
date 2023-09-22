
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first string: ");
        String fstring = scan.nextLine();
        System.out.println("Enter the second string:");
        String sstring = scan.nextLine();
        if(fstring.equals(sstring)){
            System.out.println("Same");
        }else{
            System.out.println("Different");
        }
    }
}
