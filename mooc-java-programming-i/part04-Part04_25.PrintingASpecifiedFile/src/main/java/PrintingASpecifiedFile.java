
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lines = new ArrayList<>();

        System.out.println("Which file should have its contents printed?");
        // input file name 
        String fileName = scanner.nextLine();
        // scan and add to the Arraylist 
        try (Scanner sc = new Scanner(Paths.get(fileName))) {

            
            while (sc.hasNextLine()) {
               
                String row = sc.nextLine();
                lines.add(row);
                // System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        // output
        for(String line : lines){
            System.out.println(line);
        }
    }
}
