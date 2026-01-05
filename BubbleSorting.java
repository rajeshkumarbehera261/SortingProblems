class A {
    void Bsort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j = i+1; j<arr.length-1; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("The sorted array is: ");
        for(int num: arr){
            System.out.print(num + " ");
        }
        
    }
}


public class BubbleSorting {
    public static void main(String[] args) {
        int arr[] = {12,25,15,25,4,6,7,-8};
        A obj = new A();
        obj.Bsort(arr);
    }
}

