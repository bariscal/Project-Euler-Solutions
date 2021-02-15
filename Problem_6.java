/**
 * 
 * @author bariscal
 *The sum of the squares of the first ten natural numbers is,

12 + 22 + ... + 102 = 385
The square of the sum of the first ten natural numbers is,

(1 + 2 + ... + 10)2 = 552 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */


public class Problem_6 {
	
	public static void main(String[] args) {
		
		int temp1 = 0;
		for(int i  = 0; i<=100; i++) {
			temp1 = (int) (temp1 + Math.pow(i, 2));
		}
		
		int temp2 = 0;
		for(int i = 0; i<=100; i++) {
			temp2 = temp2 + i;
		}
		int temp3 = (int) Math.pow(temp2, 2);
		
		int result = temp3 - temp1;
		System.out.println(result);
	}

}
