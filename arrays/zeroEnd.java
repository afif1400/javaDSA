package arrays;

public class zeroEnd {

  public static void efficientZeroEnd(int[] arr){
    int count = 0;
    int temp;
    for(int i=0;i<arr.length;++i){
      if(arr[i] != 0){
        temp = arr[count];
        arr[count] = arr[i];
        arr[i] = temp;
        count++;
      }
    }
    for (int j=0;j<arr.length;++j){
      System.out.println("efficient :"+arr[j]);
    }
  }
  public static void main(String[] args){
    int[] arr = {0,0,0,10,0};
    int temp;
    for(int i = 0;i<arr.length;++i){
      if(arr[i] == 0){
        for(int j=i+1;j<arr.length;++j){
          if(arr[j]!=0){
            temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
          }
        }
      }
    }
    efficientZeroEnd(arr);
  }
}
