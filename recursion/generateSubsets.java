package recursion;

public class generateSubsets {
  static void printSubsets(String s,String curr,int i){
    if(i == s.length()){
      System.out.println(curr);
      return;
    }

    printSubsets(s, curr, i+1);
    printSubsets(s,curr + s.charAt(i), i+1);
  }

  public static void main(String[] args){
    String a = "afi";
    printSubsets(a,"",0);
  }
}
