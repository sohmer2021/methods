package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //printGreeting("World");
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        printHelloWorld();
        printGreeting();
         multiplyNumbers();
         divideNumbers();


    }

    public static void printHelloWorld() {
        System.out.println("Hello World");

    }
    public static String printGreeting(String noun) {
            return "Hello "+noun;
    }

    public static int multiplyNumbers() {
        int firstNumber, secondNumber, total;
        firstNumber = 5;
        secondNumber = 10;
        total = (firstNumber*secondNumber);
        return total;

    }
    public static int divideNumbers(){
        int thirdNumber, fourthNumber, total1;
        thirdNumber = 10;
        fourthNumber = 5;
        total1 = (thirdNumber/fourthNumber);
        return (total1*2);
    }

}












