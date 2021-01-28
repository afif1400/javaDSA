package mathematics;

class Palindrome{
  static boolean isPalindrome(int num){
    int res = 0;
    int temp = num;

    while (temp != 0){
      int ld = temp % 10;
      res = res*10 + ld;
      temp = temp/10;
    }

    return (res==num);
  }

  public static void main(String[] args){
    int num = 77877;

    System.out.println(isPalindrome(num));
  }
}