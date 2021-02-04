package arrays;

public class maxCircularSubarrayNaive {
  public static void main(String[] args){
    int[] arr = {5,-2,3,4};

    int res = arr[0];
    for(int i=0;i<arr.length;++i){
      int curr_max = arr[i];
      int curr_sum = arr[i];

      for(int j=1;j<arr.length;++j){
        int index = (i+j)%(arr.length);
        curr_sum +=arr[index];
        curr_max = Math.max(curr_max, curr_sum);
      }
      res = Math.max(res, curr_max);
    }
    System.out.println(res);
   }
}
