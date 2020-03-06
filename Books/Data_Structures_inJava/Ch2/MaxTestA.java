// figure 2.15
// Read two integers and output maximum
// using Scanner and no exceptions

import java.util.Scanner;

class MaxTestA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x, y;

        System.out.println("Enter 2 ints: ");

        if (in.hasNextInt()) {
            x = in.nextInt();
            if (in.hasNextInt()) {
                y = in.nextInt();
                System.out.println("Max: " + Math.max(x, y));
                return;
            }
        }
        System.err.println("Error: need two integers");
    }
}