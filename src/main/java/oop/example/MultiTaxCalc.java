/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Angelica Palacio
 */
package oop.example;
import java.text.DecimalFormat;
import java.util.Scanner;

public class MultiTaxCalc
{
    public static void main( String[] args )
    {
        System.out.print( "What is the order amount? " );

        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        double subtotal = Double.parseDouble(a);

        System.out.print( "What is the state? " );
        String state = input.nextLine();

        String output;
        double total;
        double tax;
        DecimalFormat d = new DecimalFormat("#.##");

        if(!state.equals("Wisconsin"))
        {
            total = subtotal;
            output = "The total is $" + d.format(total) + ".\n";
        }
        else
        {
            System.out.print( "What county do you live in? " );
            String county = input.nextLine();

            if(county.equals("Dunn"))
            {
                tax = subtotal * 0.054;
                total = subtotal + tax;
                output = "The tax is $" + d.format(tax) + ".\nThe total is $" + d.format(total) + ".\n";
            }
            else if(county.equals("Eau Claire"))
            {
                tax = subtotal * 0.055;
                total = subtotal + tax;
                output = "The tax is $" + d.format(tax) + ".\nThe total is $" + d.format(total) + ".\n";
            }
            else
            {
                tax = subtotal * 0.05;
                total = subtotal + tax;
                output = "The tax is $" + d.format(tax) + ".\nThe total is $" + d.format(total) + ".\n";
            }
        }

        System.out.println(output);
    }
}
