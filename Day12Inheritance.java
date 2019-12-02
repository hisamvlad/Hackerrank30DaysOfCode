package com.hackerrank.ThirtyDaysOfCode;

import java.util.Scanner;

class Person {
    private String firstName;
    private String lastName;
    private int idNumber;

    // Constructor
    Person(String firstName, String lastName, int idNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
    }

    public void printPerson() {
        System.out.println(
                "Name: " + lastName + ", " + firstName +
                "\nID: " + idNumber
        );
    }
}

class Student extends Person {
    private int[] testScores;

    //Constructor
    Student(String firstName, String lastName, int id, int[] testScores) {
        super(firstName, lastName, id);
        this.testScores = testScores;
    }

    //calculate method
    public char calculate() {
        int average = 0;
        for (int i = 0; i < testScores.length; i++) {
            average += testScores[i];
        }

        //Easter egg - copypasted answer needs modification to be valid for hackerrank
            if (average >= 90) {
                return 'A'; // top grade
            } else if (average >= 80) {
                return 'B';
            } else if (average >= 70) {
                return 'C';
            } else if (average >= 55) {
                return 'D';
            } else if (average >= 40) {
                return 'F';
            } else {
                return 'G';
            }
        }
    }


public class Day12Inheritance {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String firstName = scr.next();
        String lastName = scr.next();
        int idNumber = scr.nextInt();
        int arrayNums = scr.nextInt();
        int[] testScores = new int[arrayNums];
        for(int i =0; i < arrayNums; i++) {
            testScores[i] = scr.nextInt();
        }
        scr.close();

        Student student = new Student(firstName, lastName, idNumber, testScores);
        student.printPerson();
        System.out.println("Grade: " + student.calculate());
    }
}






