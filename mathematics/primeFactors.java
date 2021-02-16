package mathematics;

public class primeFactors {

  // A number can be written as multiplicatoin of prime factors
  public static void primefactors(int n){

    if(n <= 1) return;
    for(int i=2;i*i <= n; ++i){
      while(n%i == 0){
        System.out.println(i);
        n = n/i;
      }
    }
    if (n>1) System.out.println(n); 

  }
  public static void main(String[] args){
    int num = 24;

    primefactors(num);
  }
}
