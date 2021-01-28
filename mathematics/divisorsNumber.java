package mathematics;

public class divisorsNumber {

  //the logic is based on the idea, all divisors appear in pairs
  static void divisors(int num){
    for(int i=1; i*i<=num;++i){
      if(num%i==0){
        System.out.println(i);
        if(i != num/i) System.out.println(num/i);
      }
    }
  }
  public static void main(String[] args){
    int num = 5;
    divisors(num);
  }
}
