
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name1 = "alex";
        String name2 = "emma";
        String pass1 = "sunshine";
        String pass2 = "haskell";
        System.out.print("Enter username: ");
        String name = scanner.nextLine(); 
        System.out.print("Enter password:");
        String password = scanner.nextLine();
        
        if (!((password.equals(pass1)||password.equals(pass2))&&(name.equals(name1)||name.equals(name2)))) {
            System.out.println("Incorrect username or password!");
        } else {
            System.out.println("You have successfully logged in!");
        } 
    }
}
