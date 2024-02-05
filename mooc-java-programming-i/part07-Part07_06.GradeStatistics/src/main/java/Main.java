
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.

        ArrayList<Integer>points =new ArrayList<>();
        int[] grade = new int[6];
        System.out.println("Enter point totals, -1 stops:");
        double totalSum = 0;
        int pass = 0;
        double passingSum = 0;
        while (true) {
            int point = Integer.valueOf(scanner.nextLine());
            if (point == -1) {
                break;
            }
            if (point >= 0 && point <= 100) {
                
                if (point >= 50) {
                    if (point >= 50 && point < 60) {
                        grade[1]++;
                    }else if (point >= 60 && point < 70) {
                        grade[2]++;
                    }else if (point >= 70 && point < 80) {
                        grade[3]++;
                    }else if (point >= 80 && point < 90) {
                        grade[4]++;
                    }else {
                        grade[5]++;
                    }
                    passingSum += point;
                    pass++;
                }else{
                    grade[0]++;
                }
                points.add(point);
                totalSum += point;
            }
        }
        double average = totalSum / (double)points.size();
        System.out.println("Point average (all): " + average);
        if (pass > 0) {
            System.out.println("Point average (passing): " + passingSum / (double)pass);
        }else{
            System.out.println("Point average (passing): -");
        }
        System.out.println("Pass percentage: " + (double)100 * pass / points.size());
        System.out.println("Grade distribution :");
        for (int i = 5; i >= 0; i--) {
            GradeDistribution(i,grade[i]);
        }

    }

    public static void GradeDistribution(int grade,int star) {
        System.out.print(grade + ": ");
        for (int i = 0; i < star; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
