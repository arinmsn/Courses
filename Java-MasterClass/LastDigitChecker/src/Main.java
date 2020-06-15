public class Main {
    public static void main(String[] args) {
        System.out.println(isValid(10)); // true
        System.out.println(isValid(468)); // true
        System.out.println(isValid(1051)); // false
        System.out.println(isValid(-1)); // false
        System.out.println("-----");
        System.out.println(hasSameLastDigit(41, 22,71)); // true
        System.out.println(hasSameLastDigit(23, 32,42)); // true
        System.out.println(hasSameLastDigit(9, 99,999)); // false
        System.out.println(hasSameLastDigit(21, 81,2000)); // false
    }

    public static boolean hasSameLastDigit(int numberOne, int numberTwo, int numberThree){
        int lastDigit_One;
        int lastDigit_Two;
        int lastDigit_Three;

        if (isValid(numberOne) && isValid(numberTwo) && isValid(numberThree)) {
            return ( (numberOne % 10 == numberTwo % 10)
                    || (numberOne % 10 == numberThree % 10)
                    || (numberTwo % 10 == numberThree % 10) );
        }
        return false;
    }

    public static boolean isValid(int number){
        if (number >= 10 && number <= 1000){
            return true;
        }
        return false;
    }
}
