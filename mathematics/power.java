package mathematics;

public class power {

  //this function uses extra space because of the recursion stack.with time efficiency of theta(logn)
  static int findPower(int x,int n){
    if(n == 0) return 1;
    int temp = findPower(x,n/2);
    temp = temp*temp;
    if(n%2 == 0) return temp;
    else return temp*x;
  }

  public static void main(String[] args){
    int num = 9;
    System.out.println(findPower(num,9));
  }
}
