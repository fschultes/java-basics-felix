package com.bt.java.basics;

import java.util.Scanner; // Import the Scanner class

public class App1 {

    private static void WhileLoopExercise() {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("gib eine beliebige Zahl zwischen 0 und 10 ein:");
            int input = Integer.parseInt(in.nextLine());
            int i = 0;
            while (i <= input) {
                System.out.print(i + ",");
                i++;
            }
        }System.out.println("done");
    }

    private static void SumOfNumbers() {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("gib eine beliebige Zahl zwischen 0 und 10 ein:");
            int input = in.nextInt();
            int i = 1;
            int sum = 0;
            System.out.print(0);
            for (i = 1; i <= input; i++) {
                System.out.print(" + " + i + " ");
                sum = sum + i;
            }
            System.out.println("= " + sum);
        }
    }

    private static void SumOfNumbetween() {
        try (Scanner in1 = new Scanner(System.in);Scanner in2 = new Scanner(System.in)) {
            
            System.out.println("gib zuerst eine kleine und dann eine größere Zahl ein:");
            int input1 = in1.nextInt();
            int input2 = in2.nextInt();
            int i = 1;
            int sum = 0;
            for (i = input1; i <= input2; i++) {
                System.out.print(" + " + i + " ");
                sum = sum + i;
            }
            System.out.println("= " + sum);
        }
    }

    public static void main(String[] args) throws Exception {

        // WhileLoopExercise();

        SumOfNumbers();

        // SumOfNumbetween();

    }
}
