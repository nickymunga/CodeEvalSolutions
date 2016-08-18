/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author n.kalu
 */
public class SumOfPrimes {
    public static void main(String[] args){
        int sum = 0;
        int counter = 0;
        for(int x =2;;x++){
            if(counter == 1000)
                break;
            if(checkPrime(x)){
                counter++;
                sum+=x;
            }
            
        }
        System.out.println(sum);
    }
    static boolean checkPrime(int nm){
        for(int x=2;x<nm;x++){
            if(nm%x==0)
                return false;
               else
                continue;
            }
       
        return true;
    }
    
}
