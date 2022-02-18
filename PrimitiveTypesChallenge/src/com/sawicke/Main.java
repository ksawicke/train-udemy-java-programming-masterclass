package com.sawicke;

public class Main {

    public static void main(String[] args) {
        byte challengeByte = 113;
        short challengeShort = 203;
        int challengeInt = 123456789;
        long challengeLongTotal = 50000L + 10L * (challengeByte + challengeShort + challengeInt);
        System.out.println("challengeLongTotal: " + challengeLongTotal);

        short challengeShortTotal = (short) (10000 + 10 * (challengeByte + challengeShort + challengeInt));
        System.out.println("challengeShortTotal: " + challengeShortTotal);
    }
}
