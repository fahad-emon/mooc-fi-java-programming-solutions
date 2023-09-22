
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points [0-100]: ");
        int x = Integer.valueOf(scan.nextLine());
        if(x<0){
            System.out.println("Grade: impossible!");
        }else if(x<=49){
            System.out.println("Grade: failed");
        }else if(x<=59){
            System.out.println("Grade: 1");
        }else if(x<=69){
            System.out.println("Grade: 2");
        }else if(x<=79){
            System.out.println("Grade: 3");
        }else if(x<=89){
            System.out.println("Grade: 4");
        }else if(x<=100){
            System.out.println("Grade: 5");
        }else{
            System.out.println("Grade: incredible!");
        }
    }
}
