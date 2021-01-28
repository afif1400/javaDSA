package arrays;

public class isSorted{
  public static void main(String[] args){
    int[] arr = {7,20,30,10};

    int flag = 0;
   
    for(int i=0;i<arr.length-1;++i){
      if(arr[i]>arr[i+1]){
        flag = 1;
      }
    }
    if(arr.length == 1){
      flag = 0;
    }
    if(flag == 1){
      System.out.println("not sorted");
    }
    else{
      System.out.println("sorted");
    }
  }
}