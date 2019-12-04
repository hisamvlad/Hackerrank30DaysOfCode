package com.hackerrank.ThirtyDaysOfCode;

import java.util.Scanner;


class TechCalc implements AdvancedArithmetic {
    public int divisorSum(int n) {
        //sum of all divisors of n
        // constraints 1<=n<=1000

        int divSum = 0;

        for(int i = 0; i <= n; i++) {
            if(n%i ==0) {
                divSum += i;
            } else {
                i++;
            }
        }


        return divSum;
    }
}

public class Day19Interfaces {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator = new TechCalc();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}
