public class SecondLargest {
    public static int get2ndLargest(int[] arr){
        int largest = Integer.MIN_VALUE;
        int j = 0;
        for(int i=0; i<arr.length; i++){
            if (arr[i] > largest) {
                largest = arr[i];
                j++;
            }
        }
        int second2ndlargest= Integer.MIN_VALUE;
        for(int i =0; i<arr.length; i++){
            if(arr[i]>second2ndlargest && i != j){
                second2ndlargest = arr[i];
            }
        }
        return second2ndlargest;
    }
    public static void main(String[] args){
        int[] arr = new int[]{2,6,4,9,3};

        System.out.println(get2ndLargest(arr));
    }
}
