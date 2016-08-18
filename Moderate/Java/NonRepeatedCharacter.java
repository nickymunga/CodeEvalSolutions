/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author n.kalu
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class NonRepeatedCharacter {
    public static void main(String[] args){
       
       try{
           Scanner input = new Scanner(new File(args[0]));
           while(input.hasNext()){
               String characters = (input.nextLine().replaceAll("\\s+", ""));
               for(int x = 0;x<characters.length();x++){
                  String ct = characters.subSequence(x, x+1).toString();
                            if(!(characters.substring(0, x).contains(ct))&&!(characters.substring(x+1).contains(ct)))
                           {
                               System.out.println(characters.charAt(x));
                               break;
                           }
                        }
           }
           
       }
       catch (FileNotFoundException ex){
           System.out.println("File Not Found : "+ex);
       }
       
        
        
    }
            
    
}
