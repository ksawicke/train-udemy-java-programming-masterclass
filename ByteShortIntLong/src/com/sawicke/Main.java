package com.sawicke;

public class Main {

    public static void main(String[] args) {

        // a byte occupies 8 bits, has a width of 8
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value: " + myMinByteValue);
        System.out.println("Byte Maximum Value: " + myMaxByteValue);
        
        // short occupies 16 bits, has a width of 16
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value: " + myMinShortValue);
        System.out.println("Short Maximum Value: " + myMaxShortValue);
        
        // int occupies 32 bits, has a width of 32
        int myIntLiteralValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value: " + myMinIntValue);
        System.out.println("Integer Maximum Value: " + myMaxIntValue);
        System.out.println("Busted Integer MAX value = " + (myMaxIntValue + 1)); // results in overflow
        System.out.println("Busted Integer MIN value = " + (myMinIntValue - 1)); // results in underflow

        long myLongLiteralValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value: " + myMinLongValue);
        System.out.println("Long Maximum Value: " + myMaxLongValue);
        long bigLongLiteralValue = 214748367234L;
        System.out.println("bigLongLiteralValue: " + bigLongLiteralValue);

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue / 2);
        byte myNewByteValue = (byte) (myMinByteValue / 2); // cast to a byte
        short myNewShortValue = (short) (myMinShortValue / 2); // cast to a short

    }
}
