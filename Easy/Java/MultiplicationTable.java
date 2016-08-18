/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author n.kalu
 */
public class MultiplicationTable {
    public static void main(String[] args){
        for(int x =1;x<13;x++)
        {
            System.out.print(String.format("%1$2s", x));
            for(int z =2;z<13;z++){
                if(z==12)
                System.out.println(String.format("%1$4s", (x*z)));
                else
                System.out.print(String.format("%1$4s", (x*z)));
            }
            
        }
    }

    
}
