/**
 * 
 * @author bariscal
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10 001st prime number?
 */


/*
 * RESULT:
 * 
 * 10001. Prime Number is: 104743
 */

import java.util.ArrayList;
import java.util.Scanner;
 

public class Problem_7 {
	
	public static ArrayList<Integer> primes = new ArrayList<Integer>();

	public static void main(String[] args) {
	    
		primes.clear();
	    primes();
	    //System.out.println(primes);
	    //System.out.println(primes.size());
	    System.out.println("10001. Prime Number is: " + primes.get(primes.size()-1));
	    
	  }
	
	public static void primes() {
		int count = 0;
		
	        for(int number=2; number<=2147483647; number++){
	        	
	            int control = 0;
	            for (int i = 2; i<number; i++){
	            	
	               if (number%i == 0){
	            	   control = 1;
	                    break;
	                } 
	            }
	                
	            if(control==0){
	                primes.add(number);
	                count++; 
	            }
	            if(primes.size() == 10001) {
	            	break;
	            }
	        }
		}
	
}
