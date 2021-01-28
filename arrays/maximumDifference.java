package arrays;

public class maximumDifference {
  public static void main(String[] args){
    int[] arr = {10,20,30};

    int res = arr[1] - arr[0];
    int min = arr[0];

    for(int j = 0;j<arr.length;j++){
      if(res<arr[j] - min){
        res = arr[j] - min;
      }
      if(min>arr[j]){
        min = arr[j];
      }
    }
    System.out.println(res);
  }
}
