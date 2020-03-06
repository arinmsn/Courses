// figure 2.17
// Read two integers from the same line and 
// output maximum using two Scanners

import java.util.NoSuchElementException;
import java.util.Scanner;

public class MaxTestC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 2 integers on one line: ");
        try {
            String oneLine = in.nextLine();
            Scanner str = new Scanner(oneLine);

            int x = str.nextInt();
            int y = str.nextInt();

            System.out.println("Max: " + Math.max(x, y));
        } catch (NoSuchElementException e) {
            System.err.println("Error: need two integers");
        }
    }
}