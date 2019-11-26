package com.hackerrank.ThirtyDaysOfCode;

import java.util.Scanner;

class Person {
    private int age;

    Person(int initialAge) {
        if(initialAge >=0) {
            this.age = initialAge;
        } else {
            this.age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }
    }




    public void amIOld() {
        String result;

        if(age < 13) {
            result = "You are young.";
        } else if (age < 18) {
            result = "You are a teenager.";
        } else {
            result = "You are old.";
        }
        System.out.println(result);
    }

    public void yearPasses() {
        this.age++;
    }
 }

public class Day4ClassVsInstance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Person p = new Person(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }
}
