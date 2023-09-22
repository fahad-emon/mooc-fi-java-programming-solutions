
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        String longest_name = ""; 
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] parts = input.split(",");
            String name = parts[0];
            int date  =  Integer.valueOf(parts[1]);
            if (longest_name.length()<name.length()) {
                longest_name = name;
            }
            sum = sum + date;
            count++;
        }
        double avarage = sum/(double)count;
        System.out.println("Longest name: "+longest_name);
        System.out.println("Average of the birth years: "+avarage);
    }
}
