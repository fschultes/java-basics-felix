package com.bt.java.basics;

import java.util.concurrent.ThreadLocalRandom;

import java.util.Scanner;  // Import the Scanner class

public class App {

    // Exercise Johannes zufallszahl raten
    public static void Zahlerraten(int zufall, int Geraten) {
        if (Geraten < zufall) {
            System.out.println("leider zu klein. Probiers nochmal!");
        }
        if (Geraten == zufall) {
            System.out.println("herzlichen Glückwunsch. Du hast die Zahl erraten!");
        }
        if (Geraten > zufall) {
            System.out.println("leider zu groß. Probiers nochmal!");
        }
    }

    private static int zufall(int zufallszahl) {
        return zufallszahl = ThreadLocalRandom.current().nextInt(0, 101);
    }

    public static void main(String[] args) throws Exception {

        // Zahlerraten(20, 20);

        // maxMinInt();

        // Exercise1((short) 50);

        // exercise2(1000000);

        // exercise3((short) 1234);

        // exercise4(2476,98);

        // incrementalOperators();

        // associativeOperators();

        // evenOdd();

        // restklassenMod5();

        // booleanTrueFalse();

        // zufallsalter();

        // characterArray();

        // exerciseStrings();

        // exerciseFizzBuzz ();

        coloringNumber ();
    }

    // Exersice Switch
    private static void coloringNumber () {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("gib eine Zahl zwischen 1-4 ein und ich sage dir ihre Farbe:");
            int input = Integer.parseInt(in.nextLine());
            switch (input) {
                case 1:
                System.out.println("Black");
                break;
                case 2:
                System.out.println("White");
                break;
                case 3:
                System.out.println("Red");
                break;
                case 4:
                System.out.println("Green");
                break;
                default:
                System.out.println("Your number has to be between 1-4");

            }
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }  
    }
    // Exercise FizzBuzz
    
    private static void exerciseFizzBuzz() {
        for (int i = 1; i <= 100; i++){

            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz"); 
            }
            else if(i % 3 == 0){
                System.out.println("Fizz"); 
            } 
            else if(i % 5 == 0){
                System.out.println("Buzz");  
            }
            else {
                System.out.println(i); 
            }
        }
        
    }

    // Charakter Array
    private static void characterArray() {
        char x = 'F';
        char i = 'E';
        char l = 'L';
        char e = 'I';
        char f = 'X';
        char s = '\u263a';

        String[] fruits = { "Apple", "Orange", "Banana" };
        System.out.println(fruits[0]);
        System.out.println(fruits[1]);
        System.out.println(fruits[2]);
        System.out.println("arrayLength: " + fruits.length);

        for (int a = 0; a < fruits.length; a++) {
            System.out.println("Fruit type: " + fruits[a]);
        }

        char[] nameArray = { x, i, l, e, f };
        System.out.println(nameArray);
        System.out.println(" ");
    }

      // Exercise Strings

      private static void exerciseStrings() {
        char[] traineeName = { 'A', 'W', ' ', 'A', 'c', 'a', 'd', 'e', 'm', 'y' };
        System.out.println(traineeName);
        for (int a = 0; a < traineeName.length; a++) {
            System.out.println(traineeName[a]);
        }
        System.out.println(" ");
        for (int a = traineeName.length - 1; a >= 0; a--) {
            System.out.println(traineeName[a]);
        }
    }

    // int variable range
    private static void maxMinInt() {
        System.out.println("max und min value");
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE + 1);
    }

    // Exercise 1
    // explicit widening type conversation
    private static void Exercise1(short smallValue) {
        int largeValue;
        System.out.println("Exercise 1");
        largeValue = (int) smallValue;
        System.out.println(largeValue);
    }

    // Exercise 2
    private static void exercise2(int largevalue1) {
        byte smallvalue1;
        System.out.println("Exercise 2");
        smallvalue1 = (byte) largevalue1;
        System.out.println(smallvalue1);
        System.out.println("Beweis Johannes");
        System.out.println(1000000 % 256);
        System.out.println(1000000 & 0xff);
    }

    // Exercise 3
    private static void exercise3(short smallvalue2) {
        float largevalue2;
        System.out.println("Exercise 3");
        largevalue2 = smallvalue2;
        System.out.println(largevalue2);
    }

    /*
     * Exercise 4
     * private static void exercise4 (int largevalue3){
     * short smallvalue3;
     * System.out.println("Exercise 4 ist Error");
     * //smallvalue3 = largevalue3;
     * System.out.println(smallvalue3);
     * }
     */

    // Exercise Operator
    private static void incrementalOperators() {
        System.out.println("Incremental Operators");
        int i = 3;

        System.out.println(i);
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);

        int j = 42;
        int k = j++ + ++j;
        System.out.println(k);
    }

    private static void associativeOperators() {
        System.out.println("Associative Operators");
        int i;
        i = 43;
        i = i + 100;
        i = i - 24;
        i = i * 2;
        i = i / 5;
        System.out.println(i);
    }

    // Relational Operators
    private static void booleanTrueFalse() {
        boolean foo = false;
        boolean bar = true;

        System.out.println(foo);
        System.out.println(bar);
        System.out.println(foo || bar);
        System.out.println(foo && bar);
    }

    // Modulodinge
    private static void restklassenMod5() {
        System.out.println("Restklassen von Modulo 5");

        for (int n = 100; n < 105; n++) {

            System.out.println("Rest von " + n + "/5 ist gleich " + n % 5);

        }
    }

    private static void evenOdd() {
        System.out.println("even or odd with Modulo 2");

        for (int n = 0; n < 5; n++) {
            if (n % 2 == 0) {
                System.out.println(n + " is Even ");
            } else {
                System.out.println(n + " is Odd ");
            }
        }
    }

    private static void zufallsalter() {
        int zufallsAlter = ThreadLocalRandom.current().nextInt(0, 101);
        if (zufallsAlter < 18) {
            System.out.println("du bist " + zufallsAlter + " jahre alt. damit bist du noch minderjährig.");
        }
        if ((18 < zufallsAlter) && (zufallsAlter < 40)) {
            System.out.println("du bist " + zufallsAlter + " jahre alt. damit bist du ein junger Erwachsener.");
        }
        if ((40 < zufallsAlter) && (zufallsAlter < 60)) {
            System.out.println("du bist " + zufallsAlter + " jahre alt. damit bist du in deinen 40ern oder 50ern.");
        }
        if ((40 < zufallsAlter) && (zufallsAlter < 60)) {
            System.out.println("du bist " + zufallsAlter + " jahre alt. damit bist du in deinen 40ern oder 50ern.");
        }
    }

}
