package mathematics;

public class trailingZerosOptimized {
  
  private static final int _200 = 200;

  public static void main(String[] args){
    int num = _200;
    int res = 0;

    // this kind of approach of finding trailing zeros in a factotial of a number ensures
    // that there is no overflow by not calculating the factorial rather finding ocuurences 
    // of number 5
    for (int i = 5; i < num;i=i*5){
      res = res + num/i; 
    }

    System.out.println(res);
  }
}
