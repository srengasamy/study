package array;

import java.util.Arrays;

public class MergeInterval {
  public int[][] merge(int[][] intervals) {
    Arrays.sort(intervals, ((o1, o2) -> {
      if (o1[0] == o2[0]) {
        return o1[1] - o2[1];
      }
      return o1[0] - o2[0];
    }));
    int top = 0;
    for (int i = 1; i < intervals.length; i++) {
      if ((intervals[top][0] <= intervals[i][0] && intervals[i][0] <= intervals[top][1])) {
        intervals[top][0] = Math.min(intervals[top][0], intervals[i][0]);
        intervals[top][1] = Math.max(intervals[top][1], intervals[i][1]);
      } else {
        intervals[++top] = intervals[i];
      }
    }
    int[][] result = new int[top + 1][2];
    for (int i = 0; i <= top; i++) {
      result[i] = intervals[i];
    }
    return result;
  }

  public static void main(String[] args) {
    int[][] nums = {{1, 4}, {4, 5}};
    int[][] result = new MergeInterval().merge(nums);
    System.out.println(result);
  }
}
