/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jassign1;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Jamie O'Brien and Jessica Reinhardt
 */
public class RunMenu 
{
    public static void main(String args[]) throws IOException
    {
        int input;
        mainmethods mm = new mainmethods();
        
        do
        {   
            Scanner scan = new Scanner(System.in);
            System.out.println(" ");
            System.out.println("Please enter the corresponding number for the application you wish to run: ");
            System.out.println("1) Product");
            System.out.println("2) Find Twelves");
            System.out.println("3) Min, Max, Average");
            System.out.println("4) Grader");
            System.out.println("5) Exit");
            input = scan.nextInt();
            
            if(input == 1)
            {
                mm.productcal();
            }
            
            else if(input == 2)
            {
                mm.twelves();
            }
            
            else if(input == 3)
            {
                mm.minmaxavg();
            }
            
            else if(input == 4)
            {
                mm.grader();
            }
            
            else if(input == 5)
            {
                System.out.println("Application closed.");
                System.exit(0);
            }
            
        }while(input != 5);
        
    }
    
    
}
