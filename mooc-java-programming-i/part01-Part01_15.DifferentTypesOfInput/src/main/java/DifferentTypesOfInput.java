
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String str = scan.nextLine();
        System.out.println("Give an integer:");
        int val = Integer.valueOf(scan.nextLine()); 
        System.out.println("Give a double:");
        double num = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean b = Boolean.valueOf(scan.nextLine());
        // output
        System.out.println("You gave the string "+str);
        System.out.println("You gave the integer "+val);
        System.out.println("You gave the double "+num);
        System.out.println("You gave the boolean "+b);

    }
}
