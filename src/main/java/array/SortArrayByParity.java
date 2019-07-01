package array;

import java.util.stream.IntStream;

public class SortArrayByParity {
  public static void main(String[] args) {
    IntStream.of(new SortArrayByParity().sortArrayByParity(new int[]{3, 1, 2, 4})).forEach(System.out::println);
  }

  public int[] sortArrayByParity(int[] A) {
    int i = 0;
    int j = A.length - 1;
    while (i < j) {
      if (A[i] % 2 == 0) {
        i++;
        continue;
      }
      if (A[j] % 2 == 1) {
        j--;
        continue;
      }
      int t = A[i];
      A[i] = A[j];
      A[j] = t;
    }
    return A;
  }
}
