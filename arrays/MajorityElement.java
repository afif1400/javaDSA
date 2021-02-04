package arrays;

public class MajorityElement {
  static int findMajorityEfficient(int[] arr){
    int res = 0, count = 0;
    for (int i=1;i<arr.length;++i){
      if(arr[res] == arr[i]) count++;
      else count--;
      if(count==0) {res = i;count = 1;}
    }
    count = 0;
    for (int i=0;i<arr.length;++i){
      if(arr[res] == arr[i]) count++;
    }
    if(count <= (arr.length)/2) res = -1;
    return res;
  }
  static int findMajorityNaive(int[] arr){
    for (int i=0;i<arr.length;i++){
      int count = 1;
      for(int j=i+1;j<arr.length;j++){
        if(arr[i] == arr[j]) count++;
      }
      if(count > (arr.length)/2) return i;
    }
    return -1;
  }

  public static void main(String[] args){
    int arr[] = {8,8,7,6,8,6,6,6,6};
    // System.out.println(findMajorityNaive(arr));
    System.out.println(findMajorityEfficient(arr));
  }
}
