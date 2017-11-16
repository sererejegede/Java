package sort;

// @author Serere
import java.util.Arrays;
import java.util.Scanner;
public class Sort {
    String input;
    String searchInput;
    String inputForSort;
    
    public void inputAccept(){
        Scanner inputAcceptor = new Scanner(System.in);
        System.out.println("Type in anything");
        input = inputAcceptor.nextLine();
        System.out.println("Enter what to search for");
        searchInput = inputAcceptor.nextLine();
        
    }
    public void search(String toSearch){
        //this.input = toSearch;
        System.out.println("The position of " + searchInput + " in '" + toSearch + "' is " + toSearch.indexOf(searchInput));
//        String t = input.indexOf(searchInput);
    }
    public void inputToArray(){
//        char[] inputArray;
//        inputArray = input.toCharArray();
        char inputArrays[] = input.toCharArray();
        Arrays.sort(inputArrays);
        StringBuilder builder = new StringBuilder();
            for(int i=0; i < inputArrays.length; i++){
                builder.append(inputArrays[i]);
            }    

        
        
        String sortedInput = builder.toString();
        System.out.println(sortedInput);
        this.inputForSort = sortedInput;
       
    }
    
    
    public static void main(String[] args) {
        Sort newSort = new Sort();
        newSort.inputAccept();
        String inputo = newSort.input;
        newSort.search(inputo);
        newSort.inputToArray();
        String inputa = newSort.inputForSort;
        newSort.search(inputa);
//        
//            int arr[] = {1, 4, 6, 2, 7, 2, 1, 0, -5, 20, -6};
//            Arrays.sort(arr);
//            
//            for(int x : arr){System.out.println(x);}
    }

    
}

//        int[] arr = {34, 22, 3, 45, 342, 213, 5};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));

/*
import java.util.Scanner;
int c, first, last, middle,n, search, array[];
Scanner in = new Scanner(System.in);
Prompt the user for number of elements
n = in.nextInt();
array = new int[n];
prompt user for n integers
for(c=0; c<n;c++)
array[c] = in.nextInt();
prompt user for value to find
search = in.nextInt();

first = 0;
last = n-1;
middle = (first+last)/2;

while(firt <= last){
if(array[middle] < search)
    first = middle+1;
else if (array[mmiddle] == search){
    tell the user that the search parameter was found at middle+11
break}
else last = middle -1;
middle = first+last/2;}
if(first>last)
print that the search parameter is not in the list
}


String textForArray = text.getText();
           char inputArrays[] = textForArray.toCharArray();
        Arrays.sort(inputArrays);
        StringBuilder builder = new StringBuilder();
        
            for(int i=0; i < inputArrays.length; i++){
                builder.append(inputArrays[i]);
            }
            
        String sortedInput = builder.toString();
//        System.out.println(sortedInput);
        this.sortedText.setText(String.valueOf(sortedInput));
        
        //searching**********************
        
        
        String searchInput = searchFor.getText();
//        int indexed = Integer.parseInt(this.index.setText(searchInput.indexOf(searchFor.getText()));
        this.index.setText(String.valueOf(searchInput.indexOf(searchFor.getText())));
//        .indexOf(searchFor);
*/