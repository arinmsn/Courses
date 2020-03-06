import java.util.Random;

public class RandomNumbers {
    // Generate random numbers (from 1-100)
    // Print number of occurances of each number

    public static final int DIFF_NUMBERS = 100;
    public static final int TOTAL_NUMBERS = 100000;

    public static void main(String[] args)
    {
        // Create array; initialize to 0s
        int [] numbers = new int [DIFF_NUMBERS + 1];
        for(int i = 0; i < numbers.length; i++)
            numberrs[i] = 0;
        
        Random r = new Random();

        // Generatoe the numbers 
        for(int = 0; i < TOTAL_NUMBERS; i++)
            numbers[r.nextInt(DIFF_NUMBERS) + 1]++;
        
        // Output the summary
        for(int i = 1; i <= DIFF_NUMBERS; i++) 
            System.out.println(i + ": " + numbers[i]);
    }
}