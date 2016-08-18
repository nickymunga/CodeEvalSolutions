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
public class SelfDescribingNumber {
    public static void main(String[] args){
        try{
            Scanner input = new Scanner(new File(args[0]));
            while(input.hasNext()){
                char[] letters = input.nextLine().toCharArray();
       
                if(checkSelfDescribing(letters))
                    System.out.println(1);
                else
                    System.out.println(0);
            }
            
        }catch(FileNotFoundException ex){}
    }
    public static boolean checkSelfDescribing(char[] arry){
       boolean ret = false;
        for(int x =0;x<arry.length;x++)
        {
            int count=0;
            for(int y =0;y<arry.length;y++)
            {
                if(x==Character.getNumericValue(arry[y]))
                    count++;
                                       
            }            
            
            if(count==Character.getNumericValue(arry[x]))
            {
                ret=true;
               
            }
            else
            {
                ret=false;
                break;
            }
        }
        return ret;
        
    }
    
}
