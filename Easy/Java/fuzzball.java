
/**
 *
 * @author n.kalu
 */

import java.io.*;
import java.util.Scanner;
public class fuzzball {
    
    public static void main(String[] args){
       fuzzball obj1 = new fuzzball();
       Scanner lines=null;
       try{
            lines = new Scanner(new File(args[0]));
            } catch (FileNotFoundException ex){ex.printStackTrace();}
        while (lines.hasNext()){
            obj1.generateFuzz(lines.nextInt(), lines.nextInt(), lines.nextInt());
            System.out.println();

        }
                  
       }
    
    
    
  
    public void generateFuzz(int div1, int div2, int cnt){
        for(int x =1; x<=cnt; x++){
            if((checkFuzz(x, div1)==true)&&(checkBall(x, div2)==true))
                System.out.print("FB ");
            else if ((checkFuzz(x, div1)==true)&&(checkBall(x, div2)==false))
                System.out.print("F ");
            else if ((checkFuzz(x, div1)==false)&&(checkBall(x, div2)==true))
                System.out.print("B ");
            else
                System.out.print(x+" ");
        }
    }
    public boolean checkFuzz(int cnt, int div1)
    {
        if(cnt%div1==0)
            return true;
        else
            return false;
    }
        public boolean checkBall(int cnt, int div2)
    {
        if(cnt % div2==0)
            return true;
        else
            return false;
    }
    
}
