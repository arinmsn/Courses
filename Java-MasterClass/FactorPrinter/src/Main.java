public class Main {
    public static void main(String[] args) {
        printFactors(6); // 1 2 3 6
        printFactors(32); // 1 2 4 8 16 32
        printFactors(10); // 1 2 5 10
        printFactors(-1); // "Invalid Value"
    }

    public static void printFactors(int number){
        if (number < 1){
            System.out.println("Invalid Value");
        }

        for (int i = 1; i <= number; i++){
            if (number % i == 0){
                System.out.println(i);
            }
        }
        System.out.println("---");
    }
}
