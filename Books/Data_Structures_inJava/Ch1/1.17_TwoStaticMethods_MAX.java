// Write two static methods. The first should return
// the maximum of three integers, and the second should
// return the max. of four integers.

// Finds maximum out of 3 integers
public class findMax {

    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 5;
        int num3 = 10;

        System.out.println(Math.max(Math.max(num1, num2), num3));
    }
}

// Find maximum out of 4 arguments