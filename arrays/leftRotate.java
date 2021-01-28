package arrays;

public class leftRotate {


  //Reverse algorithm
  public static void leftRotateReverse(int[] arr, int d){
    int n = arr.length;
    reverse(arr, 0,d-1);
    reverse(arr, d,n-1);
    reverse(arr, 0,n-1);

    for(int m=0;m<arr.length;++m){
      System.out.println(arr[m]);
    }
  }

  public static void reverse(int[] arr, int l,int h){
    while(l<h){
      int temp = arr[l];
      arr[l] = arr[h];
      arr[h] = temp;
      l++;
      h--;
    }
  }
  public static void leftRotateArray(int[] arr){
    int temp = arr[0];
    for(int i=1;i<arr.length;++i){
      arr[i-1] = arr[i];
    }
    arr[arr.length-1] = temp;
  }

  public static void leftBetter(int[] arr,int d){
    int[] temp = new int[d];
    for(int i=0;i<d;++i){
      temp[i] = arr[i];
    }

    for(int j=d;j<arr.length;++j){
      arr[j-d] = arr[j];
    }

    for(int k=0;k<d;++k){
      arr[arr.length-d+k] = temp[k];
    }

    // for(int m=0;m<arr.length;++m){
    //   System.out.println(arr[m]);
    // }
  }
  public static void main(String[] args){
    int[] arr = {1,2,3,4,5};

    // for (int i=0;i<2;++i){
    //   leftRotateArray(arr);
    // }

    // for(int j=0;j<arr.length;++j){
    //   System.out.println(arr[j]);
    // }

    // leftBetter(arr, 2);
    leftRotateReverse(arr, 2);
  }
}
