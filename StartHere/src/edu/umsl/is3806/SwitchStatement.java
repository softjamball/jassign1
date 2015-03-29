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
public class SwitchStatement 
{
    public static void main(String[] args)
    {
        int i;
        
        for(i = 0; i <10; i ++) //starts at 0, goes to 10 total, increases by 1
            switch(i)
            {
                case 0:
                    System.out.println("i is zero");
                    break;
                case 1:
                    System.out.println("i is one");
                    break;
                case 2:
                    System.out.println("i is two");
                    break;
                default:
                    System.out.println("i is three or more");
            }
    }
    
}
