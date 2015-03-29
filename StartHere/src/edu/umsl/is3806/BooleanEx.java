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
public class BooleanEx 
{
    public static void main(String[] args)
    {
        boolean b;
        
        b = false;
        System.out.println("b is " +b);
        b = true;
        System.out.println("b is " +b);
        
        //this can control the if statement
        if(b) System.out.println("This is executed");
        //don't need to put if(b == true) because of the boolean assignment at top
        
        b = false;
        if(b) System.out.println("This is not executed");
        
        //outcome of a relational operator is a boolean value
        System.out.println("10>9 is " + (10 > 9));
        
       
    }
}
