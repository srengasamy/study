package dynamic;

import java.util.Arrays;

public class MaxEnvelopes {
  public int maxEnvelopes(int[][] envelopes) {
    Arrays.sort(envelopes, ((o1, o2) -> {
      int diff = o1[0] - o2[0];
      if (diff == 0) {
        return o1[1] - o2[1];
      }
      return diff;
    }));
    int[] aux = new int[envelopes.length];
    aux[0] = 1;
    int result = 1;
    for (int i = 1; i < envelopes.length; i++) {
      int max = 1;
      for (int j = i - 1; j >= 0; j--) {
        if (envelopes[j][0] < envelopes[i][0] && envelopes[j][1] < envelopes[i][1]) {
          max = Math.max(max, 1 + aux[j]);
        }
      }
      aux[i] = max;
      result = Math.max(result, max);
    }
    return result;
  }

  public static void main(String[] args) {
    int[][] nums = {{5, 4}};//, {6, 4}, {6, 7}, {2, 3}};
    System.out.println(new MaxEnvelopes().maxEnvelopes(nums));
  }
}
