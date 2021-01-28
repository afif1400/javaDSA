package arrays;

public class largestElement {
  public static void main(String[] args){
    // ArrayList<Integer> la = new ArrayList<Integer>();

    int[] largest = {1,9,2,3,4,5,0};
    int max=largest[0];
    for(int i=0;i<largest.length; ++i){
      if(largest[i]>max){
        max = largest[i];
      }
    }
    System.out.println("max element " + max);
  }
}
