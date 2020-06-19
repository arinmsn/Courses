import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        long average = 0;
        int counter = 0;

        while (true){
            System.out.print("Enter a number: ");
            boolean isInteger = scanner.hasNextInt();

            if (isInteger){
                int number = scanner.nextInt();
                counter++;
                sum += number;
                average = Math.round((double)sum/counter);
            } else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("SUM = " + sum + " AVG = " + average);
        scanner.close();
    }
}
