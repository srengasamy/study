package array;

import java.util.stream.IntStream;

public class SortedSquares {

  public static void main(String[] args) {
    IntStream.of(new SortedSquares().sortedSquares(new int[]{-7, -3, -1})).forEach(System.out::println);
  }

  public int[] sortedSquares(int[] A) {
    int[] result = new int[A.length];
    int n = A.length - 1;
    for (int i = 0, j = A.length - 1; i <= j; ) {
      if (A[i] * A[i] >= A[j] * A[j]) {
        result[n--] = A[i] * A[i];
        i++;
      } else {
        result[n--] = A[j] * A[j];
        j--;
      }
    }
    return result;
  }

}
