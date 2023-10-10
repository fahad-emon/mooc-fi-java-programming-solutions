
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Statistics statistics = new Statistics();
        Statistics sumOfEvenNumbers = new Statistics();
        Statistics sumOfOddNumbers = new Statistics();

        System.out.println("Enter numbers:");
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }
            statistics.addNumber(number);
            if(number%2 == 0){
                sumOfEvenNumbers.addNumber(number);
            }
            else{
                sumOfOddNumbers.addNumber(number);
            }
        }
       
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + sumOfEvenNumbers.sum());
        System.out.println("Sum of odd numbers: " + sumOfOddNumbers.sum());
        
    }
}
