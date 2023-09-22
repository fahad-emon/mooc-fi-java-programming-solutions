
import java.util.Scanner;

public class Adulthood {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How old are you?");
        int s = Integer.valueOf(scan.nextLine());
        if(s >= 18 ){
            System.out.println("You are an adult");
        }else{
            System.out.println("You are not an adult");
        }
    }
}
