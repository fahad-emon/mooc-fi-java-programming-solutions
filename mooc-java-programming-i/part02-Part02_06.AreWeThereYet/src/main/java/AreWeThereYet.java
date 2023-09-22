
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        while(true){
            System.out.println("Give a number: ");
            num = Integer.valueOf(scanner.nextLine());
            if(num == 4){
                break;
            } 
        }
    }
}
