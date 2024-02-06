
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String str = scanner.nextLine();
            if ("end".equals(str)) {
                break;
            }else{
                int number = Integer.valueOf(str);
                System.out.println(number*number*number);
            }
        }
    }
}
