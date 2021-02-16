import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * 
 * @author bariscal
 *The series, 11 + 22 + 33 + ... + 1010 = 10405071317.

Find the last ten digits of the series, 11 + 22 + 33 + ... + 10001000.
 */

/*
 * RESULT:
 * Last ten digits: 9110846700
 */

public class Problem_48 {
	
	public static void main(String[] args) {
		
		
		BigDecimal bg1;
		BigDecimal bg2;
		BigDecimal temp = BigDecimal.ZERO;
		
		for(int j = 1; j<=1000; j++) {
			bg1 = new BigDecimal(j);
			bg2 = bg1.pow(j);
			temp = temp.add(bg2);		
		}
		
		
		
		String x = temp.toString();
		System.out.println("Result of the 1^1 + 2^2 + ... + 1000^1000 = " + temp);
		
		
		String[] array = x.split("");
		
		int lastIndex = array.length-1;
		int indexFromLast = lastIndex-10;
	
		
		String lastTenDigits = "";
		
		for(int i = indexFromLast+1; i<=lastIndex; i++) {				
			lastTenDigits += array[i];
			
		}
		System.out.println("Last ten digits: " + lastTenDigits);
	}
	

} 
