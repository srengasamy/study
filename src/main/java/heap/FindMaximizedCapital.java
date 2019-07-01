package heap;

public class FindMaximizedCapital {

  public int findMaximizedCapital(int k, int W, int[] profits, int[] capital) {
    int result = W;
    while (k != 0) {
      int index = Integer.MIN_VALUE;
      int p = Integer.MIN_VALUE;
      for (int i = 0; i < capital.length; i++) {
        if (capital[i] != -1 && capital[i] <= W) {
          if (p < (W - capital[i]) + profits[i]) {
            p = (W - capital[i]) + profits[i];
            index = i;
          }
        }
      }
      if (index != Integer.MIN_VALUE) {
        W = (W - capital[index]) + profits[index];
        k--;
        capital[index] = -1;
        result += profits[index];
      }else {
        return result;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(new FindMaximizedCapital().findMaximizedCapital(1, 2, new int[]{1, 2, 3}, new int[]{1, 1, 2}));
  }
}
