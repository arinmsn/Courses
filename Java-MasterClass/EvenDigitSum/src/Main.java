public class Main {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));; // 20
        System.out.println(getEvenDigitSum(252));; // 4
        System.out.println(getEvenDigitSum(-22));; // -1
        System.out.println(getEvenDigitSum(0));; // 0
    }

    // public class EvenDigitSum

    public static int getEvenDigitSum(int number){
        int evenSum = 0;
        int digit;

        if (number < 0) {
            return -1;
        }

        while (number > 0) {
            // if (((number %10)%2) == 0) // is Last digit even
            digit = number % 10;
            if (digit % 2 == 0){
                evenSum += digit;
            }
            number /= 10;
        }
        return evenSum;
    }
}
