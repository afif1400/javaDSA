package searching;

public class lastOccurence {
  //*for recursive funtion we need to search for, if the mid element is the last occurence if yes
  //*pass the mid index else check for the next element if same then pass mid+1 as low.
  static int lastIterative(int arr[], int n, int x){
    int low = 0;
    int high = n-1;

    while(low<=high){
      int mid = (low + high)/2;
      if(arr[mid] < x){
        low = mid+1;
      }
      else if(arr[mid] > x){
        high = mid-1;
      }
      else{
        if(mid == n-1 || arr[mid] != arr[mid+1]){
          return mid;
        }
        else{
          low = mid+1;
        }
      }
    }
    return -1;
  }

  public static void main(String[] args){
    int[] arr = {5,10,10,10,10,20,20};

    System.out.println(lastIterative(arr,7,10));
  }
}
