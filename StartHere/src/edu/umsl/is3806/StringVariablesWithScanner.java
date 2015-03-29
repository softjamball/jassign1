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
import java.io.InputStream;
import java.util.Scanner;
//import javax.swing.JOptionPane; //this is for input option pop ups
public class StringVariablesWithScanner 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String first_name;
        
        System.out.print("Enter your first name: ");
        first_name = sc.next( );
       // first_name = JOptionPane.showInputDialog("First Name");
        
        String last_name;
        //last_name = JOptionPane.showInputDialog("Last Name");
        System.out.print("Enter your last name: ");
        last_name = sc.next();
        
        String full_name;
        full_name = first_name + " " + last_name;
        //JOptionPane.showMessageDialog( null, full_name );

        System.out.println("You are " + full_name);
        
        //System.exit(0);
        
    }

   
    
    
}
