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
        int firstNumber = keyboard.nextInt();
        int secondNumber = keyboard.nextInt();
        System.out.println("The max number between " + firstNumber + " and " + secondNumber + " is " + max(firstNumber, secondNumber));
        System.out.println("Give me two words");
        String noun1 = keyboard.nextLine();
        String noun2 = keyboard.next();
        System.out.println(noun2 + noun1);

    }

    public static void printHelloWorld() {
        System.out.println("Hello World");

    }

    public static String printGreeting(String noun) {
        return "Hello " + noun;
    }

    public static int multiplyNumbers() {
        int firstNumber, secondNumber, total;
        firstNumber = 5;
        secondNumber = 10;
        total = (firstNumber * secondNumber);
        return total;

    }

    public static int divideNumbers() {
        int thirdNumber, fourthNumber, total1;
        thirdNumber = 10;
        fourthNumber = 5;
        total1 = (thirdNumber / fourthNumber);
        return (total1 * 2);
    }

    public static int max(int num1, int num2) {

        int result;
        if (num1 > num2) {
            result = num1;

        } else {
            result = num2;

        }
        return result;

    }
    public static String flipWords(String noun1, String noun2){
    return noun2+noun1;

}}
























