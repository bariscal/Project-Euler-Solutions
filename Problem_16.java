import java.math.BigDecimal;
import java.util.stream.Stream;

/**
 * 
 * @author bariscal
 * 215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26. 
 * What is the sum of the digits of the number 21000?
 */

/*
 * RESULT:
 * 
 * The sum of the digits of the 2 ^ 1000 operation is: 1366
 */
 

public class Problem_16 {

	public static void main(String[] args) {
		

		BigDecimal bg1 = BigDecimal.ONE;
		BigDecimal bg2 = bg1.add(bg1);
		
		BigDecimal result = bg2.pow(1000);
		
		
		String x = result.toString();
		System.out.println("Result of the 2^1000 = " + result);
		
		String[] array = x.split("");
		Integer[] intArray = Stream.of(array).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);
		
		int temp = 0;
		for(int i = 0; i<=intArray.length-1; i++) {
			temp += intArray[i];
		}
		
		System.out.println("The sum of the digits of the 2 ^ 1000 operation is: " + temp);
	}

}
