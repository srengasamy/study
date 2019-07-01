package heap;

import java.util.PriorityQueue;

public class NthSuperUglyNumber {
  public int nthSuperUglyNumber(int n, int[] primes) {
    PriorityQueue<int[]> queue = new PriorityQueue<>(((o1, o2) -> o1[0] - o2[0]));
    int[] result = new int[n + 1];
    result[0] = 1;
    for (int i = 0; i < primes.length; i++) {
      queue.offer(new int[]{primes[i], i});
    }
    int idx = 1;
    while (idx != n) {
      int[] top = queue.poll();
      int prime = top[0];
      if (result[idx - 1] != prime) {
        result[idx] = prime;
      }
      queue.offer(new int[]{top[0] * primes[top[1]], top[1]});
      idx++;
    }
    return result[n];
  }

  public static void main(String[] args) {
    System.out.println(new NthSuperUglyNumber().nthSuperUglyNumber(12, new int[]{2, 7, 13, 19}));
  }
}
