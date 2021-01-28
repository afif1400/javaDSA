package mathematics;

public class factorial {

  static int findFactorialRec(int n){
    if(n==0){
      return 1;
    }
    else{
      return n*findFactorialRec(n-1);
    }
  }

  static int findFactorial(int num){
    int res = 1;
    for(int i=2; i <= num; ++i){
      res = res*i;
    }

    return res;
  }
  public static void main(String[] args){
    int num = 5;

    System.out.println("interative: " + findFactorial(num));
    System.out.println("recursive: " + findFactorial(num));
  }
}
