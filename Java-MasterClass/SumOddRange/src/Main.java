public class Main {

    public static void main(String[] args) {
        System.out.println(isOdd(18));
        System.out.println(isOdd(1));
        System.out.println(sumOdd(1, 100)); // 2500
        System.out.println(sumOdd(20, 200)); // 9900
        System.out.println(sumOdd(-1, 100)); // -1
        System.out.println(sumOdd(100, 100)); // 0
        System.out.println(sumOdd(13, 13)); // 13
        System.out.println(sumOdd(100, -100)); // -1
        System.out.println(sumOdd(100, 1000)); // 247500
    }
    /*
    public static boolean isOdd(int number) {

        if (number > 0) {
            return (number % 2 != 0);
        }
        return false;
    }

    public static int sumOdd(int start, int end) {

        return (addUpRangeofNums(end) - addUpRangeofNums(start - 1));

    }

    public static int addUpRangeofNums(int n){
        int items = (n + 1) / 2;
        int sum = items * items;
        return sum;
    }
    */

    public static boolean isOdd(int number){
        if (number > 0){
            return ( number % 2 != 0);
        }
        return false;
    }

    public static int sumOdd(int start, int end){
        int sum = 0;

        if ( (end >= start) && (end > 0) && (start > 0)){
            for (int i = start; i <= end; i++){
                if (isOdd(i)) {
                    sum += i;
                }
            }
            return sum;
        } else return -1;
    }

} //main
