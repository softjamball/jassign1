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
public class InputFromKeyboard 
{
    public static void main(String[] args)
            throws java.io.IOException
    {
        char ch;
        
        System.out.print("Press a key followed by ENTER: ");
        
        ch = (char) System.in.read(); //gets a char from keyboard
        
        System.out.println("Your key is: " + ch);
    }
    
}
