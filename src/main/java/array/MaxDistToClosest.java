package array;

public class MaxDistToClosest {
  public static void main(String[] args) {
    System.out.println(new MaxDistToClosest().maxDistToClosest(new int[]{1, 0, 0, 0}));
  }

  public int maxDistToClosest(int[] seats) {
    int n = seats.length;
    int[] left = new int[n];
    int[] right = new int[n];
    int leftPos = -1;
    int rightPos = -1;
    for (int i = 0; i < n; i++) {
      int j = n - 1 - i;
      if (seats[i] == 1) {
        leftPos = i;
      } else {
        left[i] = leftPos == -1 ? -1 : i - leftPos;
      }
      if (seats[j] == 1) {
        rightPos = j;
      } else {
        right[j] = rightPos == -1 ? -1 : rightPos - j;
      }
    }
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < seats.length; i++) {
      if (seats[i] == 1) {
        continue;
      }
      if (left[i] == -1) {
        max = Math.max(max, right[i]);
      } else if (right[i] == -1) {
        max = Math.max(max, left[i]);
      } else {
        max = Math.max(max, Math.min(left[i], right[i]));
      }
    }
    return max;
  }
}
