package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Julian Beneche
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        System.out.print("What is the input string? ");
        String input = in.nextLine();
        int length = input.length();

        String outputString =   input + " has " + length + " characters!";

        System.out.println(outputString);


    }
}
