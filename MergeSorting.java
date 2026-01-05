public class MergeSorting {
    //print method
    public static void printarr(int[] arr){
        System.out.print("The sorted array is: ");
        for(int i= 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }
    public static void quickSort(int[] arr, int si, int ei){
        //base case
        if(si >= ei){
            return;
        }
        //we will divide of given arary with recursiverly
        int mi = (si+ei)/2;

        quickSort(arr, si, mi);
        quickSort(arr, mi+1, ei);
        merge(arr, si, mi, ei);
    }
    public static void merge(int[] arr, int si, int mi, int ei){
        int[] temp = new int[ei-si+1]; // temorary array
        int i = si; //iterator for left part
        int j = mi + 1; //iterator for right part
        int k =0;
        while (i <= mi && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        // merge rest element in left side
        while (i <= mi) {
            temp[k++] = arr[i++];
        }
        // merge rest part in right side
        while (j <= ei) {
            temp[k++] = arr [j++];
        }
        // copy temp to original array
        for(k = 0, i=si;  k<temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }
    //driver code
    public static void main(String[] args) {
        int[] arr ={14, 1,45,2,6,89,5,-3,70};
        quickSort(arr,0, arr.length-1);
        printarr(arr);

    }
}
