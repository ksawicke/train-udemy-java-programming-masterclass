package com.sawicke;

public class Main {

    public static void main(String[] args) {

        char myChar = 'D'; // char can store a single character
                           // occupies 2 bytes or 16 bits
                           // allows for storing Unicode characters
                           // or one of 65535 different types of characters
        char myUnicode = '\u0044'; // unicode-table.com
        char myEAccentAigu = '\u00e9';
        System.out.println(myChar);
        System.out.println(myUnicode);
        System.out.println(myEAccentAigu);

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;
        System.out.println(myTrueBooleanValue);
        System.out.println(myFalseBooleanValue);
    }
}
