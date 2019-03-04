package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //printGreeting("World");
        Scanner keyboard;
        printHelloWorld();

        int noun;

        keyboard = new Scanner(System.in);
        System.out.println("What is your name?");
        noun = keyboard.nextInt();
        

    }

    public static String printGreeting(String noun) {
        return "Hello "+noun;
    }

    public static void printHelloWorld() {
        System.out.println("Hello World");

    }


    public static void printName(String noun) {
    }
}






