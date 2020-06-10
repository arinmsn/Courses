public class Main {
    public static void main(String[] args) {
        float floatVal = 1.0f;
        double doubleVal = 4.0d;
        byte byteVal = 7;
        short shortVal = 7;
        long longVal = 5;

        short result1 = byteVal;    // widening conversion
        short result2 = (short)longVal; //
        short result3 = (short)(byteVal - longVal);
        double result4 = longVal - doubleVal; //
        long result5 = (long)(shortVal - longVal + floatVal + doubleVal);
        System.out.println("Success");
    }
}
