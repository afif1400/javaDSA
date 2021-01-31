package arrays;

public class kadanesAlgo {
  public static int maxSum(int[] arr){
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
    int arr[] = {-5,1,-2,3,-1,2,-2};

    System.out.println("res "+maxSum(arr));
  }
}
