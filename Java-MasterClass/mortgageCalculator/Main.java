import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;

    private static void main(String[] args) {
        int principal = (int) readNumber("Principal: ", 1000, 1_000_000);
        float annualInterest = (float)readNumber("Annaul Interest Rate: ", 1, 30);
        byte years = (byte)readNumber("Period (Years): ", 1, 30);
        
        double mortgage = calculateMortgage(principal, annualInterest, years);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Your mortgage will be " + mortgageFormatted);
    }

    public static double readNumber(String prompt, double min, double max){
        Scanner scanner = new Scanner(System.in);
        double value;
         while (true) {
            System.out.print(prompt);
            value = scanner.nextFloat();
            if (value >= min  && value < max) {
                break;
            } else {
                System.out.println("Enter a valid value between " + min + " and " + max);
            }
        }
        return value;
    }

    public static double calculateBalance(int principal, float annualInterest, byte years,
                                                short numberOfPaymentsMade
    ){
        
        float monthlyInterest = (annualInterst / PERCENT / MONTHS_IN_YEAR);
        short numberOfPayments = (short)(year * MONTHS_IN_YEAR); 

        double balance = principal
            * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterst, numberOfPaymentsMade)) 
            / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return balance;
    }

    public static double calculateMortgage(int principal, float annualInterest, byte years) {
        
        float monthlyInterest = (annualInterst / PERCENT / MONTHS_IN_YEAR);
        short numberOfPayments = (short)(year * MONTHS_IN_YEAR);
        double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                        / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return mortgage;
    }
}