package arrays;

public class LEOSubarray {
  public static void main(String[] args){
    int[] arr = {5,10,20,6,3,8};

    int res = 1;
    for(int i=0;i<arr.length;++i){
      int curr = 1;
      for(int j=i+1;j<arr.length;++j){
        if(arr[j]%2 == 0 && arr[j-1]%2 != 0 || arr[j]%2 != 0 && arr[j-1]%2 == 0 ){
          curr ++;
        }
        else{
          break;
        }
      }
      res = Math.max(res,curr);
    }

    System.out.println(res);
  }
}
