
import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String st = "true";
        System.out.print("ive a string: ");
        String str = scanner.nextLine();
        if(!(str.equals(st))){
            System.out.println("Try again!");
        }else{
            System.out.println("You got it right!");
        }
    }
}
