package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //printGreeting("World");
        Scanner keyboard = new Scanner();
        printHelloWorld();

        System.out.println(printGreeting());
        keyboard.nextLine();
    }

    public static String printGreeting(String noun) {

        return "Hello " + noun;
    }

    public static void printHelloWorld() {
        System.out.println("Hello World");

    }


    public static void printName(String noun) {
    }
}






