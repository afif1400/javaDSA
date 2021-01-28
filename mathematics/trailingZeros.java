package mathematics;

public class trailingZeros {
  static int factorial(int n){
    int res = 1;
    for(int i=2; i <= n; ++i){
      res = res*i;
    }

    return res;    
  }

  static int findTrailingZeros(int t){

    int count = 0;
    while (t%10 == 0){
      count++;
      t=t/10;
    }
    return count;
  }

  public static void main(String[] args){
    int fact = factorial(10);
    int trail = findTrailingZeros(fact);

    System.out.println(trail);
  }
}
