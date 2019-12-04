package com.hackerrank.ThirtyDaysOfCode;

import java.util.Scanner;

public class Day16Exceptions {


    static void toIntConverter(String S) throws NumberFormatException {
        try {
            int convertedString = Integer.parseInt(S);
            System.out.println(convertedString);
        } catch(NumberFormatException e) {
            System.out.println("Bad String");
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        toIntConverter(S);
    }

}
