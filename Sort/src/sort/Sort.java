package sort;

// @author Serere
import java.util.Arrays;
import java.util.Scanner;
public class Sort {
    int input;
    
    public void inputAccept(){
        Scanner inputAcceptor = new Scanner(System.in);
        System.out.println("Enter a list of numbers(integers), seperated by a space");
        input = inputAcceptor.nextInt();
    }
    
    public static void main(String[] args) {
        int[] arr = {34, 22, 3, 45, 342, 213, 5};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
}
//  int[] arr = {34, 22, 3, 45, 342, 213, 5};
//  Arrays.sort(arr);