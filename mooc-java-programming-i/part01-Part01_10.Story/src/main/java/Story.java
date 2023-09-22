
import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("I will tell you a story, but I need some information first.");
        System.out.println("What is the main character called?");
        String charname = scanner.nextLine();
        System.out.println("What is their job?");
        String job = scanner.nextLine();

        System.out.println("Here is the story:");
        System.out.println("Once upon a time there was "+charname+", who was "+job+".");
        System.out.println("On the way to work, "+charname+" reflected on life.");
        System.out.println("Perhaps " +charname+" will not be "+job+" forever.");
    }
}
