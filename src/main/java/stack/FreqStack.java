package stack;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class FreqStack {
  int index = 1;
  private Map<Integer, Integer> count = new HashMap<>();
  //[value, index, frequency]
  PriorityQueue<int[]> queue = new PriorityQueue<>((o1, o2) -> {
    if (o1[2] == o2[2]) {
      return o2[1] - o1[1];
    }
    return o2[2] - o1[2];
  });

  public FreqStack() {

  }

  public void push(int x) {
    count.put(x, count.getOrDefault(x, 0) + 1);
    queue.offer(new int[]{x, index++, count.get(x)});
  }

  public int pop() {
    int[] top = queue.poll();
    count.put(top[0], count.get(top[0]) - 1);
    return top[0];
  }

  public static void main(String[] args) {
    FreqStack freqStack = new FreqStack();
    freqStack.push(1);
    freqStack.push(2);
    freqStack.push(3);
    freqStack.push(4);
//    freqStack.test();
    System.out.println(freqStack.pop());
    System.out.println(freqStack.pop());
    System.out.println(freqStack.pop());
    System.out.println(freqStack.pop());
  }

}
