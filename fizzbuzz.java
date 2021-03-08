public class fizzbuzz {
  //* this is a solution from arnav(coding blocks) which he later said that he maid this to grab 
  //* attention of how people are posting some information videos which are or not to be technically 
  //* true
  public static void main(String[] args){
    int c3 = 0;
    int c5 = 0;
    for(int i=1;i<=100;++i){
      c3++;
      c5++;
      var d = "";
      if(c3 == 3){d += "fizz"; c3 = 0;}
      if(c5 == 5){d += "buzz"; c5 = 0;}
      if(d == "") System.out.println(i);
      else System.out.println(d);
    }

  }
}
