
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 1;
        while(true){
            System.out.println("Give a number: ");
            num = Integer.valueOf(scanner.nextLine());
            if(num == 0){
                break;
            } 
            if(num>0){
                System.out.println(num*num);
            }else{
                System.out.println("Unsuitable number");
            }
        }
    }
}
