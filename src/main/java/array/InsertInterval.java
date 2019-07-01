package array;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval {
  public static void main(String[] args) {
    int[][] intervals = {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
    int[] newInterval = {4, 8};
    int[][] result = new InsertInterval().insert(intervals, newInterval);
    for (int i = 0; i < result.length; i++) {
      System.out.println("[" + result[i][0] + "," + result[i][1] + "]");
    }
  }

  public int[][] insert(int[][] intervals, int[] newInterval) {
    List<int[]> list = new ArrayList<>();
    int i = 0;
    while (intervals[i][1] < newInterval[0]) {
      list.add(intervals[i++]);
    }
    list.add(new int[]{Math.min(intervals[i][0], newInterval[0]), Math.max(intervals[i][1], newInterval[1])});
    while (++i < intervals.length) {
      int[] last = list.get(list.size() - 1);
      if (intervals[i][0] >= last[0] && intervals[i][0] <= last[1]) {
        last[0] = Math.min(last[0], intervals[i][0]);
        last[1] = Math.max(last[1], intervals[i][1]);
      } else {
        list.add(intervals[i]);
      }
    }
    return list.toArray(new int[list.size()][2]);
  }
}
