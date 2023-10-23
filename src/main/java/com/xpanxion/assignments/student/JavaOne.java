package com.xpanxion.assignments.student;

import java.util.Scanner;

public class JavaOne {

    //
    // Constructors
    //

    public JavaOne() {}

    //
    // Public methods
    //

    public void ex1() {
        System.out.println("Student 1: ex1.");
        System.out.println(" ex1.");
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = input.nextLine();
        System.out.println("Your name in uppercase is: " + name.toUpperCase());
        input.close();
    }

    public void ex2() {
        System.out.println("Student 1: ex2.");
        System.out.println(" ex2.");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String:");
        String s = input.nextLine();
        int uppercase = 0;

        for (int i = 0; i < s.length(); i++){
           char c = s.charAt(i);
            if(Character.isUpperCase(c)){
                uppercase++;
            }
        }

        System.out.printf("The number of uppercase letters in the String is: %d", uppercase);
    }

    public void ex3() {
        System.out.println("Student 1: ex3.");
    }

    public void ex4() {
        System.out.println("Student 1: ex4.");
    }

    public void ex5() {
        System.out.println("Student 1: ex5.");
    }

    public void ex6() {
        System.out.println("Student 1: ex6.");
    }

    public void ex7() {
        System.out.println("Student 1: ex7.");
    }

    public void ex8() {
        System.out.println("Student 1: ex8.");
    }

    public void ex9() {
        System.out.println("Student 1: ex9.");
    }

    public void ex10() {
        System.out.println("Student 1: ex10.");
    }

    //
    // Private helper methods
    //
}
