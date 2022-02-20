package com.sawicke;

public class Main {

    public static void main(String[] args) {
	    // precision: the format and amount of space occupied by the type
        // single precision: 32 bits, width of 32
        // double precision: 64 bits, width of 64

        float myMinFloatVal = Float.MIN_VALUE;
        float myMaxFloatVal = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatVal);
        System.out.println("Float maximum value = " + myMaxFloatVal);

        double myMinDoubleVal = Double.MIN_VALUE;
        double myMaxDoubleVal = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleVal);
        System.out.println("Double maximum value = " + myMaxDoubleVal);

        int myIntVal = 5;
        float myFloatVal = 5.25f; // f indicating float, good practice to add
                                  // cast: (float) 5.25
        double myDoubleValue = (double) 5.25; // d indicating float, good practice to add
    }
}
