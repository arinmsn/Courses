import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
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

    public static double calculateMortgage(int principal, float annualInterest, byte years) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        float monthlyInterest = (annualInterst / PERCENT / MONTHS_IN_YEAR);
        short numberOfPayments = (short)(year * MONTHS_IN_YEAR);
        double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                        / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return mortgage;
    }
}