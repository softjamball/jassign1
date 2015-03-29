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
public class ForLoop 
{

    public static void main(String[] args)
    {
        
        int count; //loop control variable
        
        for(count = 0; count < 5; count = count++)  //iterates 5 times starting at 0 and goes up by 1
                                                    //the ++ stands for +1 (-- would be -1)
                                                    //continues until it's false
            System.out.println("This is count:" +count);
        
        System.out.println("Done!");
    }
    
}
