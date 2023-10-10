
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name of the file: ");
        String file = scanner.nextLine();

        try (Scanner sc = new Scanner(Paths.get(file))) {

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
        
                String[] parts = line.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);
        
                System.out.println(name+","+" age: "+age+" years");
            }
        }catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }

    }
}
