import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    private static void main(String[] args) {
        
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        int principal = 0;
        float monthlyInterest = 0;
        int numberOfPayments = 0; 

        Scanner scanner = new Scanner(System.in);
        

        while (true){
            System.out.print("Principal: ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1_000_000) {
                break;
            } else {
                System.out.println("Please, enter a value between $1,000 and $1,000,000");
            }
        }
        
        while (true) {
            System.out.print("Annual Interest Rate: ");
            float annualInterest = scanner.nextFloat();
            if (annualInterest >= 1 && annualInterest < 30) {
                monthlyInterest = (annualInterst / PERCENT / MONTHS_IN_YEAR);
                break;
            } else {
                System.out.println("Enter a valid value between 1-30.");
            }
        }
        
        while (true){
            System.out.print("Period (Years): ");
            byte years = scanner.nextByte();
            if (years >= 1 && years <= 30) {
                numberOfPayments = year * MONTHS_IN_YEAR;
                break;
            } else {
                System.out.println("Enter a valid value between 1-30.");
            }
        }

        double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                        / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Your mortgage will be " + mortgageFormatted);
    }
}