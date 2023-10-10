
import java.nio.file.Paths;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File: ");
        String file = scan.nextLine();
        System.out.println("Team: ");
        String team = scan.nextLine();
        int cnt = 0,w = 0,l = 0;
        try (Scanner sc = new Scanner(Paths.get(file))) {

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
        
                String[] parts = line.split(",");
                String team1 = parts[0];
                String team2 = parts[1];
                int s1 = Integer.valueOf(parts[2]);
                int s2 = Integer.valueOf(parts[3]);
                if(team.equals(team1) ){
                    cnt++;
                    if(s1>s2){
                        w++;
                    }else{
                        l++;
                    }
                }else if(team.equals(team2)){
                    cnt++;
                    if(s2>s1){
                        w++;
                    }else{
                        l++;
                    }
                }
                
            }
        }catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
        System.out.println("Games: "+cnt+"Wins: "+w+"Losses: "+l);


    }

}
