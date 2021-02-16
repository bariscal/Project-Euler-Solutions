import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * 
 * @author bariscal
 * 
 	Surprisingly there are only three numbers that can be written as the sum of fourth powers of their digits:

	1634 = 14 + 64 + 34 + 44
	8208 = 84 + 24 + 04 + 84
	9474 = 94 + 44 + 74 + 44
	As 1 = 14 is not a sum it is not included.
	
	The sum of these numbers is 1634 + 8208 + 9474 = 19316.
	
	Find the sum of all the numbers that can be written as the sum of fifth powers of their digits.
 * 
 */

/*
 * RESULT:
 * 
 	Checked by taking powers 4. 
 	 
	Number is: 1 Control is: 1
	Number is: 1634 Control is: 1634
	Number is: 8208 Control is: 8208
	Number is: 9474 Control is: 9474
	
	Sum of all the numbers that can be written as the sum of fifth powers of their digits are;
	(For the all integer interval)
	
	Number is: 1 Control is: 1
	Number is: 4150 Control is: 4150
	Number is: 4151 Control is: 4151
	Number is: 54748 Control is: 54748
	Number is: 92727 Control is: 92727
	Number is: 93084 Control is: 93084
	Number is: 194979 Control is: 194979
	
 */
 


public class Problem_30 {

	public static ArrayList<Integer> numbers = new ArrayList<Integer>();
	
	public static void main(String[] args) {

		
		for(int i = 1; i<=2147483647; i++) {
			findNo(i);
			int control = findPower(numbers);
			numbers.clear();
			if(i == control) {
				System.out.println("Number is: " + i + " Control is: " + control);
			}
			
		}

	
	}
	
	
	public static void findNo(int x) {
		while (x > 0) {  
			int y = x%10;
			x=x/10; 
			numbers.add(y);
        }
		
	}
	
	public static int findPower(ArrayList<Integer> x) {
		int temp = 0;
		int number;
		for(int i = 0; i<=x.size()-1; i++) {
			number = x.get(i);
			temp += (int)Math.pow(number, 5);
		}
		return temp;
	}

}
