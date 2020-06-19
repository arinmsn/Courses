public class Main {
    public static void main(String[] args) {
        System.out.println("Sum of digits in number " + 125 + " is " + sumDigits(125));
        System.out.println("Sum of digits in number " + 87654 + " is " + sumDigits(87654));
        System.out.println("Sum of digits in number " + -125 + " is " + sumDigits(-125));
        System.out.println("Sum of digits in number " + 1 + " is " + sumDigits(1));
        System.out.println("Sum of digits in number " + 15151515 + " is " + sumDigits(15151515));
    }

    private static int sumDigits(int number){
        int sum = 0;

        if (number < 10){
            return -1;
        }

        // 125 -> 125 / 10 = 12 -> 12 * 10 = 120 -> 125 - 120 = 5
        while (number > 0){
            int digit = number % 10;
            sum += digit;
            // drop the least-significant digit
            number /= 10;
        }
        return sum;
    }
}

