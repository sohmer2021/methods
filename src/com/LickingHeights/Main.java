package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //printGreeting("World");
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        printHelloWorld();
         multiplyNumbers();
         String greeting = printGreeting("ball");
         System.out.println(greeting);
         divideNumbers();
         System.out.print("Give me two numbers: ");
         int firstNumber= keyboard.nextInt();
         int secondNumber = keyboard.nextInt();
         System.out.println("The max number between " + firstNumber + " and " + secondNumber + " is " + max(firstNumber,secondNumber));

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
    public static int max(int num1, int num2){

        int result;
        if (num1 > num2) {
            result = num1;

        }
            else{
            result = num2;

        }
        return  result;

    }
    public static String flip(String noun){
    String word1;
    String word2;





        }

}

    //Create a method that will switch the order of two words and return it










