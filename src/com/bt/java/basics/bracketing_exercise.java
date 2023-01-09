package com.bt.java.basics;
public class bracketing_exercise {
    public static void main(String[] args) throws Exception {
        // withBrackets();
        // withoutBrackets();
        // anotherone();
        anotheronewithout();
    }
public static void withBrackets (){
    int numberInput = 11;
    if (numberInput >=5) {
        if (numberInput <= 10){
            System.out.println("The number " + numberInput + " lies between 5 and 10,");
        } else {
            System.out.println("The number " + numberInput + " does NOT lie between 5 and 10,");
        }
    } else {
        System.out.println("The number " + numberInput + " does NOT lie between 5 and 10,");
    }   
}

    public static void withoutBrackets (){
        int numberInput = 3;
        if (numberInput >=5) 
            if (numberInput <= 10)
                System.out.println("The number " + numberInput + " lies between 5 and 10,");
            else 
                System.out.println("The number " + numberInput + " does NOT lie between 5 and 10,");
        else 
            System.out.println("The number " + numberInput + " does NOT lie between 5 and 10,");
    }
    public static void anotherone (){
        int i = 11;
        if(i >= 5){
            if(i <= 10){
            System.out.println("In area 5 to 10");
            } 
        } else {
            System.out.println("Outside of 5 to 10");
                }
        }

    public static void anotheronewithout (){
        int i = 3;
        if(i >= 5)
            if(i <= 10)
            System.out.println("In area 5 to 10");
        else
        System.out.println("Outside of 5 to 10");
        }
}

