public class addAndMultiplicationTable {

    public static void main(String[] args) {
        for (int num = 0; num < 10; num++) {
            System.out.println(num + " + " + num + " = " + (num + num));
            System.out.println("\n\t" + "Multiplication");
            System.out.println("\t" + num + " x " + num + " = " + (num * num) + "\n");
        }
    }

}

/*
 * Sample output 0 + 0 = 0
 * 
 * Multiplication 0 x 0 = 0
 * 
 * 1 + 1 = 2
 * 
 * Multiplication 1 x 1 = 1
 * 
 * 2 + 2 = 4
 * 
 * Multiplication 2 x 2 = 4
 * 
 */
