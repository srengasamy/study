package array;

public class ShipWithinDays {
  public static void main(String[] args) {
    System.out.println(new ShipWithinDays().shipWithinDays(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 5));
  }

  public int shipWithinDays(int[] weights, int D) {
    int left = 0, right = 0;
    for (int w : weights) {
      left = Math.max(left, w);
      right += w;
    }
    while (left < right) {
      int mid = (left + right) / 2, need = 1, cur = 0;
      for (int w : weights) {
        if (cur + w > mid) {
          need++;
          cur = 0;
        }
        cur += w;
      }
      if (need <= D) {
        right = mid;
      } else {
        left = mid + 1;
      }
    }
    return left;
  }
}
