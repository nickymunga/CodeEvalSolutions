
import java.io.*;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author n.kalu
 */
public class removechar {
    public static void main(String[] args){
        File f = new File(args[0]);
        String words="";
        
       try{
           BufferedReader b = new BufferedReader(new FileReader(f));
            while((words = b.readLine())!=null){
           String[] wrd =words.split("\\,+");
          wrd[1]=wrd[1].replaceAll("\\s+", "");          
          generate(wrd[0],wrd[1].toCharArray()); 
       }
       } catch (FileNotFoundException ex){ex.printStackTrace();}
        catch (IOException ex){ex.printStackTrace();}
      
       
    }
    static void generate(String word, char[]ctrs){
        for(int x =0;x<ctrs.length;x++){
            word = word.replace(Character.toString(ctrs[x]), "");
        }
        System.out.println(word);
    }
}
