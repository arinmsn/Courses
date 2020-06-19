public class Main {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(12, 30)); // 6
        System.out.println(getGreatestCommonDivisor(100, 28)); // 4
        System.out.println(getGreatestCommonDivisor(8202, 208)); // 2
        System.out.println(getGreatestCommonDivisor(133, 95)); // 19
    }

    public static int getGreatestCommonDivisor(int first, int second){
        if (first < 10 || second < 10){
            return -1;
        }
        for (int i = first - 1; i >= 0; i--){
            if (first % i == 0 && second % i == 0) {
                return i;
            }
        }
        return -1;
    }
}
