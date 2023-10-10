
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        ArrayList<String> list = new ArrayList<>();
        // implement reading the file here.
        try (Scanner sc = new Scanner(Paths.get(file))) {
            while (sc.hasNextLine()) {
                String st = sc.nextLine();
                list.add(st);
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
        boolean notinlist = true;
        for(String word : list){
            if(searchedFor.contains(word)){
                System.out.println("Found!");
                notinlist = false;
                break;
            }
        }
        if(notinlist){
            System.out.println("Not found.");
        }
    }
    
}
