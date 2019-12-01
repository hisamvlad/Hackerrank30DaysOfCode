package com.hackerrank.ThirtyDaysOfCode;

import java.util.*;
import java.io.*;

public class Day11TwoDimensionalArrays {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //adding values to a 6x6 matrix
        int[][] arr = new int[6][6];
        // populating the array
        for(int i = 0; i<6; i++) {
            for(int j = 0; j< 6; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        // split the 6x6 array matrix into hourglasses
        //adding the sum of values
        // and choosing the biggest sum
        int sum = -1000;


        for(int i = 0; i<4; i++) {
            for(int j =0; j<4; j++) {
                int  currentSum = arr[i][j] + arr[i][j+1] + arr[i][j+2] +
                arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];

            if(currentSum > sum) {
                sum = currentSum;
            } else {
                sum = sum;
            }
            }
        }
            System.out.println(sum);

    scanner.close();
    }

}
