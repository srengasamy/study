package heap;

import java.util.PriorityQueue;

public class KClosest {
  public int[][] kClosest(int[][] points, int K) {
    PriorityQueue<Point> queue = new PriorityQueue<>(KClosest::distance);
    for (int[] p : points) {
      queue.add(new Point(p));
    }
    int[][] result = new int[K][2];
    for (int i = 0; i < K; i++) {
      Point min = queue.poll();
      result[i][0] = min.x;
      result[i][1] = min.y;
    }
    return result;
  }

  public static int distance(Point p1, Point p2) {
    return (p1.x * p1.x + p1.y + p1.y) - (p2.x * p2.x + p2.y * p2.y);
  }

  public static void main(String[] args) {
    KClosest closest = new KClosest();
    int[][] result = closest.kClosest(new int[][]{{3, 3}, {5, -1}, {-2, 4}}, 2);
    for (int i = 0; i < result.length; i++) {
      System.out.println(result[i][0] + "," + result[i][1]);
    }
  }

  class Point {
    int x;
    int y;

    public Point(int[] p) {
      x = p[0];
      y = p[1];
    }
  }
}
