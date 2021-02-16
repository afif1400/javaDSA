package arrays;

public class minimunFlips {
  public static void main(String[] args)
  {
    int arr[] = {0,0,1,1,1,0,0,0,1,1,1,0,0,0};

    for(int i=1;i<arr.length;++i){
      if(arr[i-1] != arr[i]){
        if(arr[i] != arr[0]){
          System.out.println("from " + i+"to");
        }
        else{
          System.out.println(i-1+"\n");
        }
      }
    }
    if(arr[arr.length-1] != arr[0]){
      System.out.println(arr.length-1);
    }
  }
}
