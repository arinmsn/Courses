public class Main {
    public static void main(String[] args) {
        double amount = 10_000D;
        for (int i = 2; i < 9; i++){
            System.out.println("$10,000 at " + i + "% is " +
                    String.format("%.2f", calculateInterest(amount, i)));
        }
        System.out.println("+----------------------+");
        // Challenge 2: Start from 8% and work back to 2%
        for (int i = 8; i > 1; i--){
            System.out.println("$10,000 at " + i + "% is " +
                    String.format("%.2f", calculateInterest(amount, i)));
        }

        // Challenge solution
        int count = 0;
        for (int i = 100; i <= 200; i++) {
            if (isPrime(i)){
                count++;
                System.out.println(i + " is a prime number.");
                if (count == 5){
                    System.out.println("Breaking for loop");
                    break;
                }
            }
        }
    }

    // Create a for statement using any range of numbers
    // Determine if the number is a prime number using the isPrime method
    // if it is a prime number, print it out AND increment a count of the
    // number of prime numbers found
    // if that count is 3 exit the for loop
    // hint: Use the break; statement to exit

    public static boolean isPrime(int n){
        if (n == 1 || n == 0){
            return false;
        }
        // Optimize code: (long) Math.sqrt(n) instead of (n/2)
        for (int i = 2; i <= (long)Math.sqrt(n); i++){
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }



    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate / 100) );
    }
}
