package array;

public class SumEvenAfterQueries {

  public static void main(String[] args) {
    int[] ans = new SumEvenAfterQueries().sumEvenAfterQueries(new int[]{1, 2, 3, 4}, new int[][]{{1, 0}, {-3, 1}, {-4, 0}, {2, 3}});
    System.out.println();
  }

  public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
    int sum = 0;
    int[] results = new int[queries.length];
    for (int num : A) {
      if (num % 2 == 0) {
        sum += num;
      }
    }
    for (int i = 0; i < queries.length; i++) {
      int val = queries[i][0];
      int pos = queries[i][1];
      if (A[pos] % 2 == 0) {
        sum -= A[pos];
      }
      A[pos] += val;
      if (A[pos] % 2 == 0) {
        sum += A[pos];
      }
      results[i] = sum;
    }
    return results;
  }

}
