import java.util.HashMap;
public class SubarraySumEql2k {
    public static int findNoOfSubArray(int[] arr, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        int k = target;
        int count = 0;
        int sum = 0;
        map.put(sum,1);
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            if(map.containsKey(sum-k)){
                count += map.get(sum-k);
            }
            if(map.containsKey(sum)){
                map.put(sum, map.get(sum)+1);
            }else{
                map.put(sum,1);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = new int[]{4,3,0,2,-2,3,4};
        int target = 7;
        System.out.println(findNoOfSubArray(arr, target));
    }
}
