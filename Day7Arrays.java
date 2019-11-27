package com.hackerrank.ThirtyDaysOfCode;


import java.util.*;

public class Day7Arrays {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int size = scr.nextInt();

        int[] numbers = new int[size];

        // collecting input into an array
       for (int i = 0; i < size; i ++) {
           numbers[i]  = scr.nextInt();
       }
       // String for holding the result
       String reverse = "";

       // Iterating in reverse order and
        // append the String with the result
        for (int j = size-1; j >= 0; j--) {
            reverse = reverse + numbers[j] + "";
            }
        System.out.println(reverse);
        }
    }

