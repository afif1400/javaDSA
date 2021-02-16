package recursion;

public class palindrome {
  static boolean isPalindrome(String str, int start,int end){
    int n = end - start;
    if(n == 0 || n == 1) return true;
    if(str.charAt(start) == str.charAt(end)){
      return isPalindrome(str, start+1, end-1);
    }
    else{
      return false;
    }
  }

  public static void main(String[] args){
    System.out.println(isPalindrome("nitin",0,4));
  }
}
