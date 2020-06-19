import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int userTypedNumber = scanner.nextInt();
        // Most specific condition on top
        if  ( (userTypedNumber % 3 == 0) && (userTypedNumber % 3 == 0) ){
            System.out.println("Fizzbuzz");
        } else if (userTypedNumber % 5 == 0){
            System.out.println("Fizz");
        } else if (userTypedNumber % 3 == 0){
            System.out.println("Buzz");
        } else {
            System.out.println(userTypedNumber);
        }

    }
}
