package array;

public class MaxChunksToSorted {
  public int maxChunksToSorted(int[] arr) {
    int ans = 0, max = 0;
    for (int i = 0; i < arr.length; i++) {
      max = Math.max(max, arr[i]);
      if (i == max) {
        ans++;
      }
    }
    return ans;
  }

  public static void main(String[] args) {
    MaxChunksToSorted max = new MaxChunksToSorted();
    System.out.println(max.maxChunksToSorted(new int[]{4, 3, 2, 1, 0}));
  }
}
