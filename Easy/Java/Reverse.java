/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author n.kalu
 */
import java.util.*; 
import java.io.*;

public class Reverse {  
  public static String FirstReverse(String str) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
      
       char[] characters = str.toCharArray();
       String newString = "";
       
       for(int c=characters.length-1;c>=0;c--)
        {
            newString+=characters[c];
            
        }
       
     
    return newString;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(FirstReverse(s.nextLine())); 
  }   
  
}
