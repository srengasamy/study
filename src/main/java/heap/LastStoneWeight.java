package heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {

  public static void main(String[] args) {
    System.out.println(new LastStoneWeight().lastStoneWeight(new int[]{2, 7, 4, 1, 8, 1}));
  }

  public int lastStoneWeight(int[] stones) {
    PriorityQueue<Integer> queue = new PriorityQueue(Collections.reverseOrder());
    for (int stone : stones) {
      queue.add(stone);
    }
    while (!queue.isEmpty()) {
      int x = queue.poll();
      if (queue.isEmpty()) {
        return x;
      }
      int y = queue.poll();
      if (x == y) {
        continue;
      }
      queue.add(Math.abs(x - y));
    }
    return 0;
  }
}
