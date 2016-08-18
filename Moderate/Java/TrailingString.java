/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author n.kalu
 */
import java.io.*;
import java.util.*;
public class TrailingString {
    public static void main(String[] args){
       
     try{
         Scanner in = new Scanner(new File(args[0]));
         while(in.hasNext()){
             String[] lines = in.nextLine().split("\\,");
             if((lines[0].regionMatches(lines[0].length()-lines[1].length(), lines[1].trim(), 0, lines[1].length()))&&(lines[0]!=null||lines[1]!=null))
            System.out.println(1);
        else
            System.out.println(0);
         }
          
     }catch(FileNotFoundException ex){ex.printStackTrace();}  
       
        
    }
    
}
