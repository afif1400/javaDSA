package mathematics;
import java.util.*;

public class seieveOfEratosthenes {
  static int isprime(int num){
    for (int i = 2;i < num; ++i){
      if(num % i == 0) {
        return 0;
      }
    }
    return 1;
  }

  static void primes(int num){
   for (int i =2;i<=num; ++i){
     if(isprime(i) == 1){
        System.out.println(i);
     }
   }
  }

  static void seiveAlgo(int num){
    List<Boolean> isPrime = new ArrayList<Boolean>(Arrays.asList(new Boolean[num+1]));
    Collections.fill(isPrime, Boolean.TRUE);

    for(int i=2;i*i<=num; ++i){
      if(isPrime.get(i)){
        for(int j=2*i;j<=num; j=j+i) {
          isPrime.set(j,false);
        }
      }
    }

    for(int i=2;i<=num; ++i){
      if(isPrime.get(i)){
        System.out.println(i);
      }
    }
  }

  public static void main(String[] args){
    int num = 100;
    System.out.println("Naive method");
    primes(num);
    System.out.println("seive Algorithm");
    seiveAlgo(num);
  }
}
