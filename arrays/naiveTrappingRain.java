package arrays;

public class naiveTrappingRain {
  public static void main(String[] args){
    int[] arr = {3,0,3};

    int res = 0;
    for(int i=1;i<arr.length-1;++i){
      int hmax = arr[i];
      for(int j=0;j<i;++j){
        hmax = Math.max(hmax,arr[j]);
      }
      int rmax = arr[i];
      for(int k=i+1;k<arr.length;k++){
        rmax = Math.max(hmax,arr[k]);
      }
      res += (Math.min(hmax,rmax) - arr[i]);
    }

    System.out.println(res);
  }
}
