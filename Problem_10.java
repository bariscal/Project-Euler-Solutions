import java.util.ArrayList;

/**
 * 
 * @author bariscal
 * 
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 * 
 */


/*
 * RESULT:
 * 
 * Scientific Notation: 1.42913828922E11
 * Real Number: 142913828922
 * 
 * NOTE: Runtime is about 5 mins.
 */


public class Problem_10 {

	public static ArrayList<Integer> primes = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		
		primes();
		double temp = 0;
		for(int i = 0; i<=primes.size()-1; i++) {
			temp += (double) primes.get(i);	
		}
		
		System.out.println(temp);
		

	}

	public static void primes() {
		int count = 0;
		
		int max = 2000000;
	        for(int number=2; number<=max; number++){
	        	
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
	            if(number == max) {
	            	break;
	            }
	        }
		}
	
	
	
}
