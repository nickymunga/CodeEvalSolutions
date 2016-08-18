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
public class ArmstronNumbers {
    public static void main(String args[]){
        try{
        Scanner input = new Scanner(new File(args[0]));
        while(input.hasNext()){
            System.out.println(checkIfArmstrong(input.nextLine().trim()));
        }
      
        }catch(FileNotFoundException ex){}
    }
    public static String checkIfArmstrong(String num){
        int nums[] = new int[num.length()];
        for(int x=0;x<nums.length;x++){
            nums[x]=Character.getNumericValue(num.charAt(x));
        }
        int sum =0;
        int power = num.length();
        for(int x=0;x<nums.length;x++){
            sum+=(int)Math.pow(nums[x], power);
        }   
        if(sum==Integer.parseInt(num))
            return "True";
        else
            return "False";
    }
    
}
