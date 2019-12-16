package com.hackerrank.ThirtyDaysOfCode;

import java.util.Scanner;

public class Day29BitwiseOperations {

    public static int findMax(int n, int k) {
        int temp = 0;
        int a = n - 1;
        while(a-- > 0) {
            for(int b = a + 1; b <= n; b++) {
                int test = a & b;
                if( test < k && test > temp) {
                    temp = test;
                }
            }
        }
        return temp;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);

            System.out.println(findMax(n, k));


        }

        scanner.close();
    }
}
