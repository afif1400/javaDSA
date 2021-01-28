package mathematics;

public class gcd {
  static int findGcd(int n, int m){
    int gcd = 1;
    for(int i=1;i <= n;++i){
      if(n%i == 0 && m%i == 0){
        if (i > gcd ) gcd = i;
      }
    }
    return gcd;
  }

  public static void main(String[] args){
    System.out.println(findGcd(7,13));
  }
}
