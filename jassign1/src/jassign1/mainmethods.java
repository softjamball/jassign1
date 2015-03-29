/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jassign1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author Jamie O'Brien and Jessica Reinhardt
 */
class mainmethods 
{
    public void productcal() throws IOException 
    {

        int product = 1;
         
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("You have selected the 'Product' application.");
        System.out.println("Please enter a series of non-negative, non-zero numbers:");
        String myline = br.readLine();
        
        StringTokenizer tok = new StringTokenizer(myline);
        
         while(tok.hasMoreTokens())
        {
            int nmbr = Integer.parseInt(tok.nextToken());

        if (nmbr== 0) 
        {
        System.out.println("An error has occurred -- input cannot contain '0'. Please restart the program.");
        System.exit(1);
        }
        

            
            if(nmbr > 0)
            {
                product = nmbr * product; 
            }
            
        }

   
            System.out.println("The product of these numbers is: " + product);
            System.out.println("'Product' complete.");
                

    }
    
        public void twelves() throws IOException 
        {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("You have selected the 'Find Twelves' application.");
        System.out.println("Please enter a series of numbers:");
        String myline = br.readLine();
        
        StringTokenizer tok = new StringTokenizer(myline);
        
        ArrayList ary = new ArrayList();

       
        while(tok.hasMoreTokens())
        {
            String temp;
            temp = tok.nextToken();
            ary.add(temp);
        }
        
            int resultf;
            resultf = ary.indexOf ( "12" );
            
            int resultl;
            resultl = ary.lastIndexOf ("12");
            
            if (resultf == -1){
                System.out.println("'12' has occured '0' times.");
            }
            
            else
            {
                // Add '1' to each index to avoid a zero-start count.
                System.out.println("The first and last occurances are '12' are at index: " +(resultf + 1) + " and " + (resultl +1));
            }
               System.out.println("'Find Twelves' complete.");

        }
        
        public void minmaxavg() throws IOException 
        {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int min = Integer.MAX_VALUE; // sets the minimum value to the largest possible int.
        int max = Integer.MIN_VALUE; // sets the maximum value to the largest possible int.
        int count = 0;
        int ttl = 0;
        
        System.out.println("You have selected the 'Min, Max, Average' application.");
        System.out.println("Please enter a series of numbers:");
        String myline = br.readLine();
        
        StringTokenizer tok = new StringTokenizer(myline);
        
         while(tok.hasMoreTokens())
        {
            int nmbr = Integer.parseInt(tok.nextToken());
            
            if (nmbr > max)
            {
                max = nmbr;
            }
            
            if(nmbr < min)
            {
                min = nmbr;
            }
            
            count++;
            ttl += nmbr;
            
        }
         double avrg = (double)ttl / count;
         System.out.println("The maximum value is " + max);
         System.out.println("Minimum value is " + min);
         System.out.println("The average is " +avrg);
         System.out.println("'Min, Max, Average' complete.");

        
        }
        
        public void grader() throws IOException 
        {
        int sumA, sumB, sumC, sumD, sumF, sumError; //sumError records error counts.
        sumA=sumB=sumC=sumD=sumF=sumError=0;
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("You have selected the 'Grader' application.");
        System.out.println("Please enter a series of numbers between 0 and 100:");
        String myline = br.readLine();
        
        StringTokenizer tok = new StringTokenizer(myline);
        

        while(tok.hasMoreTokens())
        {
            int nmbr = Integer.parseInt(tok.nextToken());
            
            // this statement prevents grade from exceeding '100' or negative values from being recorded.
            if(nmbr > 100 || nmbr < 0)
            {
                System.out.println("Error! Grade cannot exceed 100 points or drop below 0 points.");
                sumError++;
            }    
            else if(nmbr>=90)
            {
                sumA++;
                System.out.println(nmbr + " is an A");
            }
            else if(nmbr >= 70)
            {
                sumB++;
                System.out.println(nmbr + " is a B");
            }
            else if(nmbr >= 50)
            {
                sumC++;
                System.out.println(nmbr + " is a C");
            }
            else if(nmbr >= 35)
            {
                sumD++;
                System.out.println(nmbr + " is a D");
            }
            else
            {
                sumF++;
                System.out.println(nmbr + " is an F");
            }
            
            
           
               
        }

        System.out.println("The total number of A's is " + sumA);
        System.out.println("The total number of B's is " + sumB);
        System.out.println("The total number of C's is " + sumC);
        System.out.println("The total number of D's is " + sumD);
        System.out.println("The total number of F's is " + sumF);
        System.out.println("There were " + sumError +" erroneous point values entered. ");
        System.out.println("'Grader' complete.");
        }
}
