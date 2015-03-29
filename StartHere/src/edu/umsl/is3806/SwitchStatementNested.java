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
public class SwitchStatementNested 
{
    public static void main(String[] args)
    {
        int ch1 = 0;
        switch(ch1)
        {
            case 'A': System.out.println("This A is part of outer switch.");
        {
            int ch2 = 0;
            switch(ch2)
            {
                case 'A':
                    System.out.println("This A is part of inner switch");
                    break;
                case 'B':
            }
        }
                break;
            case 'B':
                
        }
    }
}
