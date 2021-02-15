import java.math.BigDecimal;
import java.util.stream.Stream;

/*
 * 
 * @author bariscal
 * 
 *
n! means n × (n − 1) × ... × 3 × 2 × 1

For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.

Find the sum of the digits in the number 100!
 * 
 */

/*
* RESULT:
*
*100! = 93326215443944152681699238856266700490715968264381621468592963895217599993229915608941463976156518286253697920827223758251185210916864000000000000000000000000
*Sum of the digits in the number 100! = 648
*
*/

public class Problem_20 {

	public static void main(String[] args) {
		
		BigDecimal bd = calculateFactorial(100);
	
		
		String x = bd.toString();
		System.out.println("100! = " + x); 
		
		String[] array = x.split("");
		Integer[] result = Stream.of(array).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);
		
		int sum = 0;
		
		for(int i = 0; i<=result.length-1; i++) {
			sum = sum + result[i];
		}
		System.out.println("Sum of the digits in the number 100! = " + sum); 
		
		
	}
		
	  private static BigDecimal calculateFactorial (int number) {
          BigDecimal factorial = BigDecimal.ONE;
          for (int i = 1; i <= number; i++) {
              factorial = factorial.multiply(new BigDecimal(i));
          }
          return factorial;
      }

}
