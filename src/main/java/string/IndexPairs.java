package string;

import java.util.PriorityQueue;

public class IndexPairs {
  public int[][] indexPairs(String text, String[] words) {
    PriorityQueue<int[]> queue = new PriorityQueue<>((o1, o2) -> {
      if (o1[0] != o2[0]) {
        return o1[0] - o2[0];
      }
      return o1[1] - o2[1];
    });
    for (String word : words) {
      int startIndex = 0;
      while (text.indexOf(word, startIndex) >= 0) {
        int i = text.indexOf(word, startIndex);
        queue.offer(new int[]{i, i + word.length()});
        startIndex = i + 1;
      }
    }
    int[][] result = new int[queue.size()][2];
    int i = 0;
    while (!queue.isEmpty()) {
      result[i++] = queue.poll();
    }
    return result;
  }

  public static void main(String[] args) {
    int[][] result = new IndexPairs().indexPairs("thestoryofleetcodeandme", new String[]{"story", "fleet", "leetcode"});
  }
}
