package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        System.out.println( "Enter length of room in ft" );
        float l = scan.nextFloat();

        System.out.println( "Enter width of room in ft" );
        float w  = scan.nextFloat();

        System.out.println( "The room is "+l+" by "+w );

        float a = l*w;
        System.out.println("Area in square feet is " +a);
        double m = a*0.09290304;
        System.out.println( "Area in square meters is " +m );
    }
}
