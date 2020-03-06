import java.util.NoSuchElementException;

// figure 2.18
// Read exactly two integers from the same line
// and output maximum using two Scanners

class MaxTestD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 2 integers on one line: ");
        try {
            String oneLine = in.nextLine();
            Scanner str = new Scanner(oneLine);

            int x = str.nextInt();
            int y = str.nextInt();

            if (!str.hasNext())
                System.out.println("Max: " + Math.max(x, y));
            else
                System.err.println("Error: extraneous data on the line.");
        } catch (NoSuchElementException e) {
            System.err.println("Error: need two integers");
        }
    }
}