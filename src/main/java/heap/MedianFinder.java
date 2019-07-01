package heap;

import java.util.PriorityQueue;

public class MedianFinder {
  PriorityQueue<Integer> max = new PriorityQueue<>(((o1, o2) -> o2-o1));
  PriorityQueue<Integer> min = new PriorityQueue<>();

  public MedianFinder() {

  }

  public void addNum(int num) {
    boolean left = min.isEmpty() || num < min.peek();
    if (left) {
      max.add(num);
      if (!(max.size() == min.size() || max.size() == min.size() + 1)) {
        min.offer(max.poll());
      }
    } else {
      min.add(num);
      if (!(max.size() == min.size() || max.size() == min.size() + 1)) {
        max.offer(min.poll());
      }
    }
  }

  public double findMedian() {
    if (min.size() == max.size()) {
      return (min.peek() + max.peek()) / 2.0;
    }
    return max.peek();
  }

  public static void main(String[] args) {
    MedianFinder medianFinder = new MedianFinder();
    medianFinder.addNum(1);
    medianFinder.addNum(2);
    System.out.println(medianFinder.findMedian());
    medianFinder.addNum(3);
    System.out.println(medianFinder.findMedian()
    );
  }
}
