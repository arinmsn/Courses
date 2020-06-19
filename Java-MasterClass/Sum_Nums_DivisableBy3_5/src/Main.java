public class Main {
    public static void main(String[] args) {
        // Create a statement using a range of numbers from 1-1000 inclusive
        // Sum all the #s that can be divided with both 3 and also with 5
        // For those #s that met the above conditions, print out the number.
        // break out of the loop once you find 5 numbers that meet the above conditions.
        // After breaking out of the loop, print the sum of the numbers that met the above condion

        int count = 0;
        int sum = 0;
        for (int i = 1; i <= 1000; i++){
            if ( (i % 3 == 0) && (i % 5 == 0) ){
                count++;
                sum += i;
                System.out.println(i);
                if (count == 5){
                    break;
                }
            }
        } // for loop
        System.out.println("Total: " + sum);
    }
}
