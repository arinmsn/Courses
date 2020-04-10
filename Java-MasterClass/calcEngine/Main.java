package com.earlybirdcoder.calcengine;

public class Main {

    public static void main(String[] args) {
		double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
		double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
		char[] opCodes = {'d', 'a', 's', 'm'};
		double[] results = new double[opCodes.length];

		for (int i = 0; i < opCodes.length; i++){
			if (opCodes[i] == 'a')
				result = leftVals[i] + rightVals[i];
			else if (opCode == 's')
				result = val1 - val2;
			else if (opCode == 'd')
				result = val2 != 0.0d ? val1/val2 : 0.0d;
//			if (val2 != 0.0d)
//				result = val1 / val2;
//			else
//				result = 0.0d;
			else if (opCode == 'm')
				result = val1 * val2;
			else {
			System.out.println("Error - invalid opCode");
			result = 0.0d;
		}
		}
		
		System.out.println(result);
    }
}