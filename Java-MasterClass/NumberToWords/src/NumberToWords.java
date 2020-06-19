public class NumberToWords {

    public static void numberToWords(int number){
        if (number < 0){
            System.out.println("Invalid Value");
        }

        if (number == 0){
            System.out.println("Zero");
            return;
        }

        int digitCount = getDigitCount(number);
        number = reverse(number);
        int reversedDigitCount = getDigitCount(number);
        String[] numberToWords = {"Zero", "One", "Two", "Three", "Four",
                                "Five", "Six", "Seven", "Eight", "Nine"};


        System.out.println(number+"\t\t"+reversedDigitCount);
        while (number > 0) {
            System.out.println(numberToWords[number % 10]);
            number /= 10;
        }

        while (digitCount != reversedDigitCount++){
            System.out.println(numberToWords[0]);
        }

        System.out.println("---");
    }

    public static int reverse(int number){
        int reverseNumber = 0;
        while (number != 0){
            reverseNumber *= 10;
            reverseNumber += number % 10;
            number /= 10;
        }
        return reverseNumber;
    }

    public static int getDigitCount(int number){
        int count = 0;
        if (number < 0){
            return -1;
        }

        if (number == 0){
            return 1;
        }

        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }

}
