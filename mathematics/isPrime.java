package mathematics;

public class isPrime {
  static int isprime(int num){
    for (int i = 2;i < num; ++i){
      if(num % i == 0) {
        return 0;
      }
    }
    return 1;
  }

  public static void main(String[] args){
    int num = 12;

    System.out.println(isprime(num));
  }
}
