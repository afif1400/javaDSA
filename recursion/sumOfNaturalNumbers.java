package recursion;

public class sumOfNaturalNumbers{

  static int sumNatural(int n){
    if(n == 0){
      return 0;
    }
    return n+ sumNatural(n-1);
  }
  public static void main(String[] args){
    System.out.println(sumNatural(5));
  }
}