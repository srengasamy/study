package array;

import java.util.Stack;

public class InsertInterval {
  public static void main(String[] args) {
    int[][] intervals = {{1, 5}};
    int[] newInterval = {2, 3};
    int[][] result = new InsertInterval().insert(intervals, newInterval);
    for (int i = 0; i < result.length; i++) {
      System.out.println("[" + result[i][0] + "," + result[i][1] + "]");
    }
  }

  public int[][] insert(int[][] intervals, int[] newInterval) {
    int n = intervals.length;
    int i = 0;
    while (i < n) {
      if (intervals[i][1] < newInterval[0]) {
        i++;
      } else {
        break;
      }
    }
    if (i == n) { //last
      int[][] result = new int[intervals.length + 1][2];
      for (int j = 0; j < n; j++) {
        result[j] = intervals[j];
      }
      result[n] = newInterval;
      return result;
    }
    Stack<int[]> stack = new Stack<>();
    for (int j = 0; j < n; j++) {
      if (j < i) {
        stack.push(intervals[j]);
      } else {
        if (j == i) {
          stack.push(newInterval);
        }
        if (!stack.isEmpty()
                && ((stack.peek()[0] <= intervals[j][0] && intervals[j][0] <= stack.peek()[1])
                || (stack.peek()[0] <= intervals[j][1] && intervals[j][1] <= stack.peek()[1]))
                || (intervals[j][0] <= stack.peek()[0] && stack.peek()[1] <= intervals[j][1])) {
          stack.peek()[0] = Math.min(stack.peek()[0], intervals[j][0]);
          stack.peek()[1] = Math.max(stack.peek()[1], intervals[j][1]);
        } else {
          stack.push(intervals[j]);
        }
      }
    }
    int[][] result = new int[stack.size()][2];
    for (int j = stack.size() - 1; j >= 0; j--) {
      result[j] = stack.pop();
    }
    return result;
  }
}
