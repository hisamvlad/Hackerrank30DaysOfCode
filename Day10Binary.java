package com.hackerrank.ThirtyDaysOfCode;

import java.util.*;

public class Day10Binary {
    public static void main(String[] args) {
    Scanner scr = new Scanner(System.in);
    int dec = scr.nextInt();

            int count = 0;
            int sequence = 0;

            while (dec > 0)
            {
                if(dec % 2 == 1) {
                    count++;
                    // If the counter has increased, we record this increase
                    // in a "sequence" variable
                if (count>=sequence){
                    sequence = count;
                 }
                }
                //Otherwise, we are resetting the counter
                else {
                    count = 0;
                }
                dec = dec/2;
            }
        // The output will be the number of times "sequence" was increased
        // AKA number of consequent 1s.

        System.out.println(sequence);
    }
}

