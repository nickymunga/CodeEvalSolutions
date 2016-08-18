
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
public class InterruptedBubbleSort {
    public static void main(String[] args){
        try{
            Scanner input = new Scanner(new File(args[0]));
            while(input.hasNext()){
                
              String[] lines =input.nextLine().split("\\|");
              long limit = Long.parseLong(lines[1].replaceAll("\\s",""));
             System.out.println(sort(lines[0].split("\\s+"), limit));
              
            }
        }catch (FileNotFoundException ex){ex.printStackTrace();}
    }
    static String sort(String[] arr, long loop){
        String temp ="";
        String ret="";
        for(int x =0; x<arr.length;x++){
                if(x>=loop)
                 break;        
            for(int y=1;y<arr.length -x;y++){
             
                if(Integer.parseInt(arr[y-1].replaceAll("\\s+", ""))>Integer.parseInt(arr[y].replaceAll("\\s+", "")))
                {
                    temp = arr[y-1];
                    arr[y-1]=arr[y];
                    arr[y]= temp;                    
                    
                }
            }
        }
        for(int x =0;x<arr.length;x++){
            ret+=arr[x]+" ";
        }
        return ret;
    }
    
}
