package arrays;

// using kadanes algorithm find the max sum in O(n) then substract the minimum sub subarray from 
// to get max sum of a circular subarray
public class maxCircularSubarrayEfficient {

  public static int kadanesSum(int[] arr){
    int res[] = new int[arr.length];
    res[0] = arr[0];
    int max = res[0];
    for (int i=1;i<arr.length;++i){
      res[i] = Math.max(res[i-1]+arr[i],arr[i]);
      max = Math.max(res[i], max);
    }
    return max; 
  }
  public static void main(String[] args){
    int[] arr = {5,-2,3,4};
    int res = arr[0];
    int kadanesMax = kadanesSum(arr);
    if(kadanesMax < 0){
      System.out.println(kadanesMax);
    }
    int arr_sum = 0;
    for (int i=0;i<arr.length;++i){
      arr_sum += arr[i];
      arr[i] = -arr[i];
    }
    int max_circular = arr_sum + kadanesSum(arr);
    System.out.println(Math.max(max_circular, kadanesMax));


  }

}
