package array;

import java.util.HashMap;
import java.util.Map;

public class ImageOverlap {
  public static void main(String[] args) {
    int[][] A = {{1, 1, 0}, {0, 1, 0}, {0, 1, 0}};
    int[][] B = {{0, 0, 0}, {0, 1, 1}, {0, 0, 1}};
    System.out.println(new ImageOverlap().largestOverlap(A, B));
  }

  public int largestOverlap(int[][] A, int[][] B) {
    int max = Integer.MIN_VALUE;
    Map<String, Integer> results = new HashMap<>();
    for (int bRow = 0; bRow < B.length; bRow++) {
      for (int bCol = 0; bCol < B[bRow].length; bCol++) {
        for (int aRow = 0; aRow < A.length; aRow++) {
          for (int aCol = 0; aCol < A[aRow].length; aCol++) {
            int startRow = aRow - bRow;
            int startCol = aCol - bCol;
            String key = startRow + "," + startCol;
            int count = results.getOrDefault(key, 0) + 1;
            results.put(key, count);
            max = Math.max(count, max);
          }
        }
      }
    }
    return max;
  }

}
