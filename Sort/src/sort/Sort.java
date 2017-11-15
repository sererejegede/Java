package sort;

// @author Serere
import java.util.Arrays;
import java.util.Scanner;
public class Sort {
    String input;
    String searchInput;
    
    public void inputAccept(){
        Scanner inputAcceptor = new Scanner(System.in);
        System.out.println("Type in anything");
        input = inputAcceptor.nextLine();
        System.out.println("Enter what to search for");
        searchInput = inputAcceptor.nextLine();
        
    }
    public void search(String toSearch){
        this.input = toSearch;
        System.out.println(toSearch.indexOf(searchInput));
        
    }
    public void inputToArray(){
        char[] inputArray;
        inputArray = input.toCharArray();
        Arrays.sort(inputArray);
        String sortedInput = Arrays.toString(inputArray);
        System.out.println(sortedInput);
        search(sortedInput);
    }
    
    
    public static void main(String[] args) {
        Sort newSort = new Sort();
        newSort.inputAccept();
        
        newSort.inputToArray();
        String inputo = newSort.input;
        //newSort.search(inputo);
//        if
    }

    
}

//        int[] arr = {34, 22, 3, 45, 342, 213, 5};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));