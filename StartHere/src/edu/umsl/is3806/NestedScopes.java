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
public class NestedScopes 
{
    public static void main(String[] args)
    {
        int x;
        x = 10;
        if(x == 10)
        {  //starts new scope
            int y = 20;
            
            System.out.println("x and y: " + x + " " + y);
            x = y * 2;
        }
        // y is not known here
        
        System.out.println("x is " + x);
    }
    
}
