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


    }

    public static String printGreeting(String noun) {
        return "Hello "+noun;

    }

    public static void printHelloWorld() {
        System.out.println("Hello World");

    }

    public static int multiplyNumbers() {
        int firstNumber, secondNumber, total;
        firstNumber = 5;
        secondNumber = 10;
        total = 5*10;
        return total;



    }}












