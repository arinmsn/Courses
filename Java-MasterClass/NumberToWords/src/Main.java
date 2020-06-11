public class Main {
    public static void main(String[] args) {
        System.out.println("--- getDigitCount method ---");
        System.out.println(NumberToWords.getDigitCount(0)); // 1
        System.out.println(NumberToWords.getDigitCount(123)); // 3
        System.out.println(NumberToWords.getDigitCount(-12)); // -1
        System.out.println(NumberToWords.getDigitCount(5200)); // 4
        System.out.println("--- reverse method ---");
        System.out.println(NumberToWords.reverse(-121)); // -121
        System.out.println(NumberToWords.reverse(1212)); // 2121
        System.out.println(NumberToWords.reverse(4321)); // 1234
        System.out.println(NumberToWords.reverse(100)); // 1
        System.out.println("--- numberToWords ---");
        NumberToWords.numberToWords(123);
        NumberToWords.numberToWords(1010);
        NumberToWords.numberToWords(1000);
        NumberToWords.numberToWords(-12);
        NumberToWords.numberToWords(0);
    }
}
