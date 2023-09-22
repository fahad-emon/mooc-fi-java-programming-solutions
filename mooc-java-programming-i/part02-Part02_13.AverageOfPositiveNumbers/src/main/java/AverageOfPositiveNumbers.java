
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 1;
        int sum = 0,c=0;
        while(true){
            num = Integer.valueOf(scanner.nextLine());
            if(num == 0){
                break;
            }else if(num>0) {
                sum = sum + num;
                c = c + 1;
            }
        }
        if(sum > 0){
            System.out.println((double)(sum/(double)c));
        }else{
            System.out.println("Cannot calculate the average");
        }
        
    }
}
