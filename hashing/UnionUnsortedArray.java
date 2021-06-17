package hashing;

import java.util.HashSet;

public class UnionUnsortedArray {

  public static int unionCount(int[] a, int[] b) {
    HashSet<Integer> h = new HashSet<Integer>();

    for (int i : a) {
      h.add(i);
    }

    for (int j : b) {
      h.add(j);
    }

    return h.size();
  }

  public static void main(String[] args) {
    int[] a = { 10, 30, 10, 40 };

    int[] b = { 40, 5, 10, 15 };

    int res = unionCount(a, b);

    System.out.println(res);
  }

}
