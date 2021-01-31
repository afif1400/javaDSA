package arrays;

public class maxConsecutiveOnes {
  public static void main(String[] args){
    int arr[] = {0,0,0};

    int res = 0;
    int count = 0;
    for(int i=0;i<arr.length;++i){
      if(arr[i] == 1){
        count++;
      }
      if(res < count){
        res = count;
      }
      if(arr[i] == 0){
        res = count;
        count = 0;
      }
      
    }
    System.out.println(res);
  }
}
