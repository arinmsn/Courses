import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minNumber = Integer.MAX_VALUE;
        int maxNumber = Integer.MIN_VALUE;
        // Solution #1 to a bug (min incorrectly shown as 0)
//        boolean first = true;

        while(true){
            System.out.print("Enter a number: ");
            boolean isInteger = scanner.hasNextInt();

            if (isInteger){
                int number = scanner.nextInt();

                // Solution #1
//                if (first){
//                    first = false;
//                    minNumber = number;
//                    maxNumber = number;
//                }

                if (number > maxNumber){
                    maxNumber = number;
                }

                if (number < minNumber) {
                    minNumber = number;
                }

            } else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("Min: " + minNumber + "\t\tMax: " + maxNumber);
        scanner.close();
    }
}
