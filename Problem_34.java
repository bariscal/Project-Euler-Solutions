/**
 * 
 * @author bariscal
 * 
 *
145 is a curious number, as 1! + 4! + 5! = 1 + 24 + 120 = 145.
Find the sum of all numbers which are equal to the sum of the factorial of their digits.
Note: As 1! = 1 and 2! = 2 are not sums they are not included.
 * 
 */

/*
 * results:
 * 
 * 2 ---> 2! = 2
 * 145 ---> 1! + 4! + 5! ---> 1 + 24 + 120 = 145
 * 40585 ---> 4! + 0! + 5! + 8! + 5! ---> 24 + 1 + 120 + 40320 + 120 =
 * 
 */

public class Problem_34 {

	//MAX INTEGER VALUE
	final static int MAX_VALUE = 2147483647;
	
	public static void main(String[] args) {
		

		
		for(int i = 2; i <= MAX_VALUE; i++) {
			if(i == dec(i)) {
				System.out.println(i);
			}
		}

	}
	
	public static int factorial(int x) {
		int temp = 1;
		for(int i=1; i<=x; i++) {
			temp *= i;
		}
		return temp;
	}
	
	public static int dec(int x) {
	 int num = x; 
	 int count = 0,temp=0;

     while(num != 0)
     {
        temp += factorial(num%10);
        num /= 10;
         ++count;
     }

     return temp;
	}
}
