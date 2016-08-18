
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author n.kalu
 */
public class ReverseWords {
    public static void main(String[] args){
        try{
            Scanner input = new Scanner(new File(args[0]));
            while(input.hasNext()){
                String[] lines = input.nextLine().split("\\s+");
                for(int x =lines.length-1;x>=0;x--){
                    System.out.print(lines[x]+" ");
                }
                System.out.println();
            }
        }
        catch (FileNotFoundException ex){ex.printStackTrace();}
    }
    
}
