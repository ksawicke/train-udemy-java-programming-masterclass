package com.sawicke;

public class Main {

    public static void main(String[] args) {
	    // precision: the format and amount of space occupied by the type
        // single precision: 32 bits (4 bytes), width of 32
        // double precision: 64 bits (8 bytes), width of 64

        float myMinFloatVal = Float.MIN_VALUE;
        float myMaxFloatVal = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatVal);
        System.out.println("Float maximum value = " + myMaxFloatVal);

        double myMinDoubleVal = Double.MIN_VALUE;
        double myMaxDoubleVal = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleVal);
        System.out.println("Double maximum value = " + myMaxDoubleVal);

        int myIntVal = 5 / 3;
        float myFloatVal = 5f / 3f; // f indicating float, good practice to add
                                  // cast: (float) 5.25
        double myDoubleValue = 5d / 3d; // d indicating float, good practice to add
        System.out.println("MyIntValue = " + myIntVal);
        System.out.println("MyFloatValue = " + myFloatVal);
        System.out.println("MyDoubleValue = " + myDoubleValue);

        // Challenge
        // Convert a given number of pounds to kilograms
        // 1 lb = 0.45359237 kg

        double numPounds = 260d;
        double kgConversion = 0.45359237d;
        double numKg = numPounds * kgConversion;
        System.out.println("numKg: " + numKg);

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);
    }
}
