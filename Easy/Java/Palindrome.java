/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author n.kalu
 */
public class Palindrome {
    public static void main(String[] args){
        Palindrome obj1 = new Palindrome();
        int num=0;
        for(int x =1000;x>=1;x--){
            num = obj1.reverse(x);
            if((num==x)&&obj1.isPrime(num)){
                System.out.println(x);
                break;
            }
           
        }
    }
    
    public int reverse(int num){
        String x = Integer.toString(num);
        String newString ="";
        for(int y=x.length()-1;y>=0;y--){
            newString+=x.charAt(y);
        }
        return Integer.parseInt(newString); 
    }
    public boolean isPrime(int num){
        for(int x=2;x<num;x++){
            if(num%x==0)
                return false;
               else
                continue;
            }
        return true;
        }
            
    }
            
    
            
    

