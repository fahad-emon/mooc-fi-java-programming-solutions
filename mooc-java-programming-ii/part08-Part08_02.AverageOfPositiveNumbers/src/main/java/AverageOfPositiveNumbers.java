
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int cnt = 0;
        int sumOfPosNum = 0;

        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 0) {
                break;
            }
            if (num > 0) {
                sumOfPosNum += num;
                cnt++;
            }
        }
        if (cnt == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println((double) sumOfPosNum / cnt);
        }

    }
}
