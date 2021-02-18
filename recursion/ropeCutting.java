package recursion;

public class ropeCutting {
  static int getPieces(int n,int a,int b,int c){
    if(n == 0) return 0;
    if(n < 0 ) return -1;

    int res = Math.max(getPieces(n-a,a,b,c),Math.max(getPieces(n-b,a,b,c),getPieces(n-c,a,b,c)));

    if(res == -1){
      return -1;
    }
    return res+1;
  }
  
  public static void main(String[] args){
    System.out.println(getPieces(9,2,2,2));
  }
}
