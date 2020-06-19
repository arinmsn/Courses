public class Main {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(11,10)); // true
        System.out.println(hasSharedDigit(-1,10)); // false
        System.out.println(hasSharedDigit(929,18)); // false
        System.out.println(hasSharedDigit(18, 929)); // false
        System.out.println(hasSharedDigit(20,90)); // true
        System.out.println(hasSharedDigit(100,10)); // false
    }

    // public class SharedDigit
    public static boolean hasSharedDigit(int firstNum, int secondNum){
       if ((firstNum < 10 || firstNum > 99) || (secondNum < 10 || secondNum > 99)) {
           return false;
       }
       int firstNum_remainder = firstNum % 10;
       int secondNum_remainder = secondNum % 10;

       firstNum /= 10;
       secondNum /= 10;
       return ( firstNum == secondNum || firstNum == secondNum_remainder
               || firstNum_remainder == secondNum || firstNum_remainder == secondNum_remainder);
    }
}
