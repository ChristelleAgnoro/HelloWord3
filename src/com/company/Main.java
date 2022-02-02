package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Declaring keyboard as a scanner to get user input
        Scanner keyboard = new Scanner(System.in);

        // Prompt ask for name
        System.out.print ("What is your name? ");

        // User answer
        String input = keyboard.nextLine();

        // Hello message to user
        System.out.println( "Hello "+ input + " !" );    }
}
