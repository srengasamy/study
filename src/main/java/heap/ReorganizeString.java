package heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class ReorganizeString {
  public String reorganizeString(String S) {
    PriorityQueue<Char> queue = new PriorityQueue<>(((o1, o2) -> o2.count - o1.count));
    Map<Character, Integer> maps = new HashMap<>();
    for (int i = 0; i < S.length(); i++) {
      char c = S.charAt(i);
      maps.put(c, maps.getOrDefault(c, 0) + 1);
    }
    for (Map.Entry<Character, Integer> entry : maps.entrySet()) {
      queue.offer(new Char(entry.getKey(), entry.getValue()));
    }
    StringBuffer sb = new StringBuffer();
    while (!queue.isEmpty()) {
      Char c = queue.poll();
      if (queue.isEmpty()) {
        if (c.count > 1) {
          return "";
        } else {
          sb.append(c.c);
        }
      } else {
        Char newC = queue.poll();
        while (c.count != 0 && newC.count != 0) {
          sb.append(c.c);
          sb.append(newC.c);
          c.count--;
          newC.count--;
        }
        if (c.count > 0) {
          queue.offer(c);
        }
        if (newC.count > 0) {
          queue.offer(newC);
        }
      }
    }
    return sb.toString();
  }

  class Char {
    char c;
    int count;

    public Char(char c, int count) {
      this.c = c;
      this.count = count;
    }
  }

  public static void main(String[] args) {
    char[] charts = {'a', 'a'};
    //System.out.println(new ReorganizeString().getEndOfSeq(charts, 'a', 0, 1));
    System.out.println(new ReorganizeString().reorganizeString("aaabb"));
  }
}
