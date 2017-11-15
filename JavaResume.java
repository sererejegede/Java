import java.util.Scanner; 
import java.math.BigInteger;
public class JavaResume{
   
	public static void main(String[]args){
		Scanner fact = new Scanner(System.in);
		BigInteger factorial = BigInteger.ONE;
		int j;
		j = fact.nextInt();
		System.out.println("Enter a number: ");
		//for(int i = j; i >= 1; i--){
			for(int i = 1; i<=j; i++){
			
			factorial = factorial.multiply(BigInteger.valueOf(i));
			// System.out.println(factorial + " x " + i  + " = " + factorial);
		}
		System.out.println(j + "! = " + factorial);
		int b = 1;
		BigInteger factNum = BigInteger.ONE;		//for sequential printing
		for(int a = 1; a <= j; a++){
			b = b * a;
			System.out.println();
		}
	}
}