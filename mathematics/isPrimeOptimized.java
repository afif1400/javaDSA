package mathematics;

public class isPrimeOptimized {

  // this can further be optimized by initially checking if the number is even, this can save half of
  // the iterations then further checking if it is devisible by 3 for the same above reason.
  // then we can run a loop starting from 5 incrementing it by 6. With same constraint of sqrt(n).
  //! ex: for(int i = 5;i <= Math.sqrt(num); i=i+6){
  //! if(num%i == 0 || n%(i+2) == 0) return false.
  //! }
  static int isprime(int num){
    for (int i = 2;i <= Math.sqrt(num); ++i){
      if(num % i == 0) {
        return 0;
      }
    }
    return 1;
  }

  public static void main(String[] args){
    int num = 15;

    System.out.println(isprime(num));
  }
}
