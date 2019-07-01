package array;

import java.util.stream.IntStream;

public class SortArrayByParityII {

  public static void main(String[] args) {
    IntStream.of(new SortArrayByParityII().sortArrayByParityII(new int[]{2, 3, 1, 1, 4, 0, 0, 4, 3, 3})).
            forEach(System.out::println);
  }

  public int[] sortArrayByParityII(int[] A) {
    for (int i = 0, j = A.length - 1; i < j; ) {
      if (A[i] % 2 == 0) {
        i++;
      } else if (A[j] % 2 == 1) {
        j--;
      } else {
        int t = A[i];
        A[i] = A[j];
        A[j] = t;
        i++;
        j--;
      }
    }
    int[] result = new int[A.length];
    int k = 0;
    for (int i = 0, j = A.length / 2; j < A.length; i++, j++) {
      result[k++] = A[i];
      result[k++] = A[j];
    }
    return result;
  }
}
