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
public class FloatingPointTypes 
{
    public static void main(String[] args)
    {
        double x, y, z;
        
        x = 3; 
        y = 4;
        
        z = Math.sqrt(x*x + y*y);  //Math is the class we're calling and sqrt() is a method of the Math class
                                    //this is similar to how System.out is a class and println() is the method
        
        System.out.println("Hypotenuse is " +z);
        
    }
    
    
}
