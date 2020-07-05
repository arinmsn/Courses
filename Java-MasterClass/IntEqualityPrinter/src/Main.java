public class Main {
    public static void main(String[] args) {
        printEqual(1,1,1);  // All numbers are equal
        printEqual(1,1,2); // Neither all are equal or different
        printEqual(-1,-1,-1); // Invalid value
        printEqual(1,2,3); // All numbers are different
    }

    public static void printEqual(int firstNum, int secondNum, int thirdNum){
        if ( (firstNum < 0) || (secondNum < 0) || (thirdNum < 0)){
            System.out.println("Invalid Value");
        } else if ( (firstNum == secondNum) && (firstNum == thirdNum)){
            System.out.println("All numbers are equal");
        } else if ( (firstNum == secondNum) || (firstNum == thirdNum) || (secondNum == thirdNum)) {
            System.out.println("Neither all are equal or different");
        } else {
            System.out.println("All numbers are different");
        }
    }

}
