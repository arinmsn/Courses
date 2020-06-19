public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number){
        int firstDigit = 0;
        int lastDigit;
        int sum = 0;

        if (number < 0)
            return -1;

        if (number == 0)
            return number;

        firstDigit = number;
        while (firstDigit >= 10){
            firstDigit = firstDigit / 10;
        }
        lastDigit = number % 10;

        sum = firstDigit + lastDigit;
        return sum;
    }

}
