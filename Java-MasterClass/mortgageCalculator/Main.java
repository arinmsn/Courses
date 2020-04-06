import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    private static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = (annualInterst / PERCENT / MONTHS_IN_YEAR);

        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = year * MONTHS_IN_YEAR;

        double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                        / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Your mortgage will be " + mortgageFormatted);
    }
}