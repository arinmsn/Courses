package com.arin.ByteShortIntLong;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	    int myValue = 10000;
	    int myMinIntValue = Integer.MIN_VALUE;
	    int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        int myMaxIntTest = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Min Value: " + myMinByteValue);
        System.out.println("Byte Max Value: " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Min Value: " + myMinShortValue);
        System.out.println("Short  Max Value: " + myMaxShortValue);

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Min Value: " + myMinLongValue);
        System.out.println("Long  Max Value: " + myMaxLongValue);

        int myTotal = (myMinIntValue / 2);
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        short myNewShortValue = (short) (myMinShortValue / 2);

        byte challenge_byteNumber = 120;
        short challenge_shortNumber = 3000;
        int challenge_intNumber = 20_000;
        long challenge_longNumber = 50_000L + 10L*(challenge_byteNumber + challenge_shortNumber + challenge_intNumber);
        System.out.println("challenge_longNumber: " +  challenge_longNumber);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;
        System.out.println("Integer: " + myIntValue
                            + "\t\tFloat: " + myFloatValue
                            + "\t\tDouble: " + myDoubleValue);
        double weight_lbs = 100d;
        double weight_kg = weight_lbs * 0.4535237;
        System.out.println(weight_kg);

        char myChar = 'A';
        char unicode_three_in_persian = '\u0663';
        System.out.println(unicode_three_in_persian);

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;
        boolean isCustomerOver21 = true;

        int result = 11 % 5; // 1 + 2 = 3
        System.out.println(result);
        result++;
        System.out.println(result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("I can assure you that");
        }

        int topScore = 80;
        if (topScore < 100){
            System.out.println("You got the high score!");
        }

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Greater than second top score and less than 100. ");
        }

        if ((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("Either or both of the conditions are true.");
        }

        int newValue = 50;
        if (newValue == 50){ // Error was due to single '='
            System.out.println("This is an error.");
        }

        boolean isCar = false;
        if (isCar){ // !isCare for false
            System.out.println("This is not supposed to happen");
        }

        boolean wasCar = isCar ? true : false;
        if (wasCar){
            System.out.println("wasCare is true");
        }

        // Operator Challege - video #39
        double double_firstValue = 20.00d;
        double double_secondValue = 80.00d;
        // step 3
        double double_first_plus_second = (double_firstValue + double_secondValue) * 100.00d;
        System.out.println("Values total: " + double_first_plus_second);
        // step 4
        double video39_remainder = double_first_plus_second % 40.00d;
        System.out.println("Remainder (step4): " + video39_remainder);
        //step 5
        // boolean isNoRemainder = (theRemainder == 0) ? true : false;
        boolean isRemainderZero = true;
        System.out.println("Step 6: Boolean output: " + isRemainderZero);
        // step 7
        if (!isRemainderZero) {
            System.out.println("Got some remainder");
        }

    }
}
