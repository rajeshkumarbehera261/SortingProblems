public class QuickSorting {
    //print statement
    public static void printarr(int[] arr){
        System.out.println("The sorted array is: ");
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void quicksort(int[] arr, int si, int ei){
        if(si >= ei){
            return;
        }
        int pivotIndex = getpivot(arr, si , ei);
        quicksort(arr, si, pivotIndex-1);
        quicksort(arr, pivotIndex + 1, ei);
    }
    public static int getpivot(int[] arr, int si , int ei){
        int pivot = arr[ei];
        int i = si -1;
        
        for(int j = si; j< ei; j++){   
            if(arr[j] <= pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //place the pivot element in the correct position
        i++;
        int temp = arr[i];
        arr[i] = arr[ei];
        arr[ei] = temp;
        return i;
    }
    public static void main(String[] args) {
        int[] arr = {45,1,3,8,44,23,-7,0  };
        quicksort(arr, 0, arr.length-1); 
        printarr(arr);
    }
}
