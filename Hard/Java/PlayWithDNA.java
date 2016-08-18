

/**
 *
 * @author n.kalu
 */
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
public class PlayWithDNA {
    public static void main(String[] args){
       File f = new File(args[0]);
        
       
     try{
          Scanner input = new Scanner(new File(args[0]));
            while(input.hasNext()){
           String[] wrd =input.nextLine().split("\\s");
           generateOccurences(wrd);
            System.out.println();
            }
       } catch (FileNotFoundException ex){ex.printStackTrace();}
       
        }
    static void generateOccurences(String[] words){
        String segment=words[0].replaceAll("\\s", "");
      
        int mismatches = Integer.parseInt(words[1].replaceAll("\\s", ""));
        String dna =words[2].replaceAll("\\s", "");
        boolean ret=false;
        String result="";
       
        for(int x=0;x<=(dna.length()-(segment.length()));x++){
           result+=checkMismatches(segment,dna.substring(x, (x+segment.length())),mismatches);
            
        }
        if(!result.isEmpty())
                sortArray(result);
            else
                System.out.println("No match");
        
    }
    static String checkMismatches(String segment, String dna, int check){
        String result = "";
        //if((dna.length()>300||dna.length()<1000||check<0||check>40||segment.length()<3||segment.length()>50))
           // return false;
        int counter = 0;
        for(int x =0;x<segment.length();x++){
            if(segment.charAt(x)==dna.charAt(x))
                counter++;
        }
        if((segment.length()-counter)<=check){            
            result+=dna+" ";
          }
        return result;
     
    }
    static void sortArray(String dna)
    {
        System.out.println("Sorting Array");
        String[] arr= dna.split("\\s");
        String temp ="";
        for(int x = 0;x<arr.length-1;x++){
            
            for(int y =x+1;y<arr.length;y++){
              
                if(arr[x].compareToIgnoreCase(arr[y])>0)
                {
                    temp = arr[x];
                    arr[x]=arr[y];
                    arr[y]=temp;
                }
                
            }
        }
        for(int x=0;x<arr.length;x++)
        {
            System.out.print(arr[x]+" ");
        }
    }
    
    
    
}
