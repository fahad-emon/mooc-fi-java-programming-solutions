import java.util.Scanner;

public class UserInterface {

    private Scanner scan;
    private BirdManager birdManager;

    public UserInterface(Scanner scan, BirdManager birdmanager) {
        this.scan = scan;
        this.birdManager = birdmanager;
    }

    public void startProgram() {
        userCmd();
    }

    public void userCmd() {
        while (true) {
            System.out.print("?");
            String cmd = this.scan.nextLine();
            System.out.println();

            if (cmd.equals("Quit")) {
                break;
            } else if (cmd.equals("Add")) {
                System.out.print("Name: ");
                String name = this.scan.nextLine();
                System.out.println();
                System.out.print("Name in Latin: ");
                String ltnName = this.scan.nextLine();
                System.out.println();
                Bird newbird = new Bird(name, ltnName);
                this.birdManager.addBird(newbird);
            } else if (cmd.equals("Observation")) {
                System.out.print("Bird? ");
                String name = this.scan.nextLine();
                System.out.println();
                boolean flag = true;
                for (Bird bird : this.birdManager.getBirdList()) {
                    if (bird.getName().equals(name)) {
                        bird.increaseObservation();
                        flag = false;
                    }
                }
                if (flag) {
                    System.out.println("Not a bird!");
                }
            } else if (cmd.equals("All")) {
                for (Bird bird : this.birdManager.getBirdList()) {
                    System.out.println(bird);
                }
            } else if (cmd.equals("One")) {
                System.out.print("Bird? ");
                String name = this.scan.nextLine();
                System.out.println();
                boolean flag = true;
                for (Bird bird : this.birdManager.getBirdList()) {
                    if (bird.getName().equals(name)) {
                        System.out.println(bird);
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    System.out.println("Not found.");
                }
            }
        }
    }

}
