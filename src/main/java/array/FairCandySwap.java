package array;

import java.util.HashSet;
import java.util.Set;

public class FairCandySwap {
  public static void main(String[] args) {
    int[] result = new FairCandySwap().fairCandySwap(new int[]{1}, new int[]{2, 3});
    System.out.println();
  }

  public int[] fairCandySwap(int[] A, int[] B) {
    int sumA = 0, sumB = 0;
    Set<Integer> set = new HashSet<>();
    for (int a : A) {
      sumA += a;
    }
    for (int b : B) {
      sumB += b;
      set.add(b);
    }
    for (int a : A) {
      int y = a + (sumB - sumA) / 2;
      if (set.contains(y)) {
        return new int[]{a, y};
      }
    }
    return new int[0];
  }
}
