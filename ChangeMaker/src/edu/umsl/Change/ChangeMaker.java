/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.umsl.Change;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

        
public class ChangeMaker 
{
    public static void main(String[] args)
    {

     int dollars = 0;
     double cents = 0;
     int quarters = 0;
     int dimes = 0;
     int nickles = 0;
     int pennies = 0;
     double money;
     
     
     Scanner input = new Scanner(System.in);
    
    
     
     System.out.println( "Enter an amount of money: " );
     
     money = input.nextDouble();
     
     dollars = (int) (money);
     cents =  100 * (money - (double)dollars);
     
     quarters = (int) (cents / 25);
     cents = cents - (quarters *25);
     
     dimes = (int) (cents / 10);
     cents = cents - (dimes *10);
     
     nickles = (int) (cents / 5);
     cents = cents - (nickles *5);
     
     pennies = (int) (cents / 1);
     
     
     
     System.out.println("Dollars = " +dollars);
     System.out.println("Quarters = " +quarters);
     System.out.println("Dimes = " +dimes);
     System.out.println("Nickles = " +nickles);
     System.out.println("Pennies = " +pennies);
     
             
             
             
}
}

        