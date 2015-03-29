/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.umsl.is3806;

/**
 *
 * @author Jamie
 */
public class GalToLitTable 
{
    public static void main(String[] args)
    {
        double gallons, liters;
        int counter;
        
        counter = 0;
        for(gallons = 1; gallons <= 100; gallons ++) // starting at 1 gallon and going to 100, going up by 1 each time
        {
            liters = gallons * 3.7854; //convert to liters
            System.out.println(gallons + " gallons is " + liters + "liters");
            
            counter++;  //increment the line counter with each loop
            if(counter == 10) //if counter is 10, output a blank line
                System.out.println();  //blank line
            counter = 0; //reset since after if statement
            
            {
                
            }
            
        }
        
    }
}
