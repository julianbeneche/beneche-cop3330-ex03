package Ex03;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Julian Beneche
 */

import java.util.Scanner;

public class Ass1 {
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        System.out.print("What is the quote? ");
        String quote = in.nextLine();

        System.out.print("Who said the quote? ");
        String speaker = in.nextLine();

        //Could not find how to put string in quotes
        String outputString =   speaker + " says," + quote;

        System.out.println(outputString);


    }
}
