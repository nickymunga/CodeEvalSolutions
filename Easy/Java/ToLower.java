
import java.util.*;
import java.io.*;
public class Main
{
        public static void main(String[] args){
        
        try{
            Scanner input = new Scanner(new File(args[0]));
            while(input.hasNext()){
                String[] words = input.nextLine().split("\\,");
                if(words[0].contains(words[1]));
                {
                    int index =0;
                    for(int x =0;x<words[0].length();x++){
                        if(words[1].equals(words[0].charAt(x)))
                            index =x;
                    }
                }
                
            }
        }catch (FileNotFoundException ex){ex.printStackTrace();}
            
        }
}