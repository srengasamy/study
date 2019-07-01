package array;

import java.util.HashMap;
import java.util.Map;

public class NumPairsDivisibleBy60 {
  public static void main(String[] args) {
    System.out.println(new NumPairsDivisibleBy60().numPairsDivisibleBy60(new int[]{60, 60, 60}));
  }

  public int numPairsDivisibleBy60(int[] time) {
    for (int i = 0; i < time.length; i++) {
      time[i] = time[i] % 60;
    }
    Map<Integer, Integer> count = new HashMap<>();
    int ans = 0;
    for (int num : time) {
      ans += count.getOrDefault(60 - num, 0);
      count.put(num, count.getOrDefault(num, 0) + 1);
    }
    return ans;
  }
}
