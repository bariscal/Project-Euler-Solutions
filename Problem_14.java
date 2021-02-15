import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

/**
 * 
 * @author bariscal
 *The following iterative sequence is defined for the set of positive integers:

n → n/2 (n is even)
n → 3n + 1 (n is odd)

Using the rule above and starting with 13, we generate the following sequence:

13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms.
 Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

Which starting number, under one million, produces the longest chain?

NOTE: Once the chain starts the terms are allowed to go above one million.
 *
 *
 *
 */


//Note: Largest number assigned as 110k because stack size is not enough to
//calculate until 1M.
public class Problem_14 { 

	public static LinkedList<Integer> collatzNumbers = new LinkedList<Integer>();
	static LinkedList<Integer> sizes = new LinkedList<Integer>();
	
	
	public static void main(String[] args) {
		
		/*
		Collatz(9);
		System.out.println(collatzNumbers);
		System.out.println(findSize());
		
		Collatz(5);
		System.out.println(collatzNumbers);
		System.out.println(findSize());
		
		Collatz(6);
		System.out.println(collatzNumbers);
		System.out.println(findSize());
		*/
		
					
			for(int i = 2; i<=110000; i++) {	
				Collatz(i);
				sizes.add(collatzNumbers.size());
				collatzNumbers.clear();
				}
			
	
	
		int max = Collections.max(sizes);
		Collatz((sizes.indexOf(max)+2));
		//System.out.println(collatzNumbers);
		System.out.println("Maximum chain: " + collatzNumbers);
		System.out.println("Maximum chain length: " + max);
		//System.out.println(sizes.indexOf(max));
		System.out.println("The number that produces the longest chain is: " + (sizes.indexOf(max)+2));
		
		

	}
	
	public static int Collatz(int x) {
		
		if(x != 1) {
			if(x%2 == 0) {
				x = x/2;
				collatzNumbers.add(x);
			}
			else {
				x = (3*x) + 1;
				collatzNumbers.add(x);
			}
			Collatz(x);
		}
		
		return x;

	}
	
	public static int findSize() {
		int size = collatzNumbers.size();
		collatzNumbers.clear();
		return size;
			
		}
	

}
