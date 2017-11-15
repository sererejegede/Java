package factorialclass;
import java.util.Scanner;
import java.math.BigInteger;
public class FactorialClass{
    public int num;
    public void numberInput(){
        System.out.println("The formula for calculating the factorial of a number n is n*(n-1)*(n-2)*...*2*1.");
        Scanner fact = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = fact.nextInt();
    }
    public void factorialCalculator(){
        BigInteger factorial = BigInteger.ONE;
         for (int i = 1; i <= num; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
    System.out.println(num + "! = " + factorial);
    }
    public void stepByStep(){
        int a = 1;
    BigInteger factNum = BigInteger.ONE;		
    BigInteger factNum2 = BigInteger.ONE;
    System.out.println("The steps for calculating " + num + "! are as follows");
        while (a <= num) {
            System.out.println(a + " x " + factNum2 + " = " + factNum);
            factNum2 = factNum2.multiply(BigInteger.valueOf(a));
            a++;
            factNum = factNum.multiply(BigInteger.valueOf(a));
        }
    
    }
     public static void main(String[] args) {
         FactorialClass factorialObject = new FactorialClass();
         factorialObject.numberInput();
         factorialObject.factorialCalculator();
         factorialObject.stepByStep(); 
     }
}
