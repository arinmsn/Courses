import java.util.NoSuchElementException;

// figure 2.16
// Read two integers and output maximum
// using Scanner and exceptions

class MaxTestB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Etner 2 integers: ");

        try {
            int x = in.nextInt();
            int y = in.nextInt();

            System.out.println("Max: " + Math.max(x, y));
        } catch (NoSuchElementException e) {
            System.err.println("Error: need two integers");
        }
    }
}