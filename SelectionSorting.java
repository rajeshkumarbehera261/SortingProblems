
import java.util.*;
public class SelectionSorting {
    public static void selectionSort(int[] arr){
       /* for(int i = 0; i<arr.length-1; i++){
        int minIndex = i ; //assume the 1st element of the unsored part is the min
            //find the min element from the unsored part
            for(int j = i+1; j<arr.length; j++){
                if(arr[j]  < arr[minIndex]){
                    minIndex = j;
                }
            }
        //swap the found min element with first element of unsorted part
        int temp = arr[minIndex];
        arr[minIndex] = arr[i];
        arr[i] = temp;     
       } 
       System.out.println("The sorted array is: ");
       for(int num : arr){    
        System.out.print(num + " ");
       } */
    }
    public static void main(String[] args) {
        int arr[] = {45,1,54,9,32,4,12,3,4};
        Arrays.sort(arr);
        System.out.println("The sorted part is: "+Arrays.toString(arr));
        //selectionSort(arr);
    }
}
