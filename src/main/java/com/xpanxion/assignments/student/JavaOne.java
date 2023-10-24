package com.xpanxion.assignments.student;

import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (i % 2 == 0) {
                output.append(words[i].toUpperCase());
            } else {
                output.append(words[i]);
            }
            if (i < words.length - 1) {
                output.append(" ");
            }
        }

        System.out.println("The modified string is: " + output.toString());
    }   

    public void ex4() {
        System.out.println("Student 1: ex4.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        if(isPalindrome(input)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
    public boolean isPalindrome(String str){
        int i = 0, j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }

        return true;
    }

    public void ex5() {
        System.out.println("Student 1: ex5.");
        Scanner scanner = new Scanner(System.in);
        String input;
        do{
        System.out.println("Enter a string or Enter quit to exit:");
       
        input = scanner.nextLine();
        int vowels = 0, consonants = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = Character.toLowerCase(input.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels++;
            } else if (Character.isLetter(c)) {
                consonants++;
            }
        }

        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
        } while(!input.equalsIgnoreCase("quit"));

    }

    public void ex6() {
        System.out.println("Student 1: ex6.");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = input.nextInt();
        System.out.println("Enter second number:");
        int num2 = input.nextInt();

        System.out.printf("The sum of the two numbers is %d", num1+num2);

    }

    public void ex7() {
        System.out.println("Student 1: ex7.");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int x = input.nextInt();
        System.out.print("Enter second integer: ");
        int y = input.nextInt();
        input.nextLine();
        System.out.println("Enter operation(+,-,*,/):" );
        String s = input.nextLine();

        switch (s){
        case "+" -> System.out.println("Result: " + (x+y));
        case "-" -> System.out.println("Result: " + (x-y));
        case "*" -> System.out.println("Result: " + (x*y));
        case "/" -> System.out.println("Result: " + (double)x/(double)y);
        default -> System.out.println("Invalid operator");
        }


    }

    public void ex8() {
        System.out.println("Student 1: ex8.");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter price per square feet of carpet: ");
        int price = input.nextInt();
        input.nextLine();
        System.out.println("Enter number of rooms: ");
        int rooms = input.nextInt();
        int i = 1;
        double totalCost = 0;
        while( i <= rooms){
            System.out.printf("Enter width of room %d: ", i);
            int width = input.nextInt();
            System.out.printf("Enter length of the room %d: ", i);
            int length = input.nextInt();
            totalCost += (width*length);
            i++;
        }
        System.out.printf("Total cost = $%.2f ",totalCost);
        
    }

    public void ex9() {
        System.out.println("Student 1: ex9.");
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int random = rand.nextInt(6);
        int guess;
        do {
            System.out.println("Guess a number: ");
            guess = input.nextInt();
            if (guess != random){
                System.out.println("Try again...");
            } else {
                System.out.println("You guessed it!");
            }    
        }while (guess != random);
    }

    public void ex10() {
        System.out.println("Student 1: ex10.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        String[] words = input.split(" ");

        for (String word : words) {
             for (int i = 0; i < word.length(); i++){
                for(int k = 0; k < i; k++){
                    System.out.print(" ");
                }
                System.out.println(word.charAt(i));
             }
        }

    }

    //
    // Private helper methods
    //
}
