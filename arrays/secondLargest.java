package arrays;

public class secondLargest {
  public static int getLargest(int arr[]){
    int largest = 0;
    for(int i=0;i<arr.length;++i){
      if(arr[i]>arr[largest]){
        largest = i;
      }
    }
    return largest;
  }
  public static int getSecondLargest(int arr[],int largest){
    int secondLargest = 0;
    // int res = -1;
    for(int i=0;i<arr.length;++i){
      if(arr[i]>arr[secondLargest]){
        if(i!=largest){
          secondLargest = i;
        }
      }
    }
    return secondLargest;
  }

  public static int getSecondLrgestSingleTraverse(int arr[]){
    int res = -1; int largest = 0;
    for(int i=0;i<arr.length;++i){
      if(arr[i]>arr[largest]){
        res = largest;
        largest = i;
      }
      else if(arr[i]!=arr[largest]){
        if(res == -1 || arr[i]> arr[res]){
          res = i;
        }
      }
    }
    return res;
  }

  public static void main(String[] args){
      int[] arr = {15,30,15,25,10};

      // int largest = getLargest(arr);
      // int secondLargest = getSecondLargest(arr,largest);
      int sl = getSecondLrgestSingleTraverse(arr);
      System.out.println("secondLargest element is at:" + sl);
  }
}
