public class Main {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(1));
        System.out.println(getLargestPrime(-5));
        System.out.println(getLargestPrime(21));
    }

    // public class LargestPrime {}
    public static int getLargestPrime(int number){
        boolean isPrime;
        int largestPrimeFactor = -1;

        if (number <= 0 || number == 1){
            return -1;
        }
        for (int i = 2; i <= number; i++){
            if (number % i == 0){
                isPrime = true;
                for (int j = 2; j <= (long)(Math.sqrt(i)); j++){
                    if (i % j == 0){
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime)
                    largestPrimeFactor = i;
            }
        }
        return largestPrimeFactor;
    }
}
