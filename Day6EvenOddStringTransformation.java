package com.hackerrank.ThirtyDaysOfCode;

import java.util.*;
import java.io.*;

// For passing a submission test uncomment the lines
// In normal EDI they throw the InputMissmatchException

public class Day6EvenOddStringTransformation {

 public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
       // int numOfTestCases = scr.nextInt();
       // for(int i = 0; i < numOfTestCases; i++) {

            char[] ch = scr.next().toCharArray();

            // iterating through the array
            // and printing even chars
            for(int j = 0; j < ch.length; j += 2 ) {
                System.out.print(ch[j]);
            }
            // Whitespace
            System.out.print("");
            // iterating through the array
            // and printing odd chars
            for(int j = 1; j <ch.length; j +=2) {
                System.out.print(ch[j]);
            }
            System.out.println();
        }

      //  scr.close();

  }

//}
