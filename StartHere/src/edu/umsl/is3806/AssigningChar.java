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
public class AssigningChar 
{
    public static void main(String[] args)
    {
        char ch;
        ch = 'X';
        
        System.out.println("ch contains " +ch);
        
        ch++; //increment (increase by one) ch
        System.out.println("ch is now " +ch);
        
        ch = 90; // give ch the value Z <-char can be assigned an integer value
                    //the 90 is ASCII and Unicode value for the letter Z
        System.out.println("ch is now " + ch);
    }
    
}
