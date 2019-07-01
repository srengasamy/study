package array;

import java.util.ArrayList;
import java.util.List;

public class PancakeSort {
  public static void main(String[] args) {
    System.out.println(new PancakeSort().pancakeSort(new int[]{3,2,4,1}));
  }

  public List<Integer> pancakeSort(int[] A) {
    List<Integer> result = new ArrayList<>();
    for (int i = A.length - 1; i > 0; i--) {
      int max = 0;
      for (int j = 1; j <= i; j++) {
        if (A[j] > A[max]) {
          max = j;
        }
      }
      if (max == i) {
        continue;
      }
      if (max != 0) {
        result.add(max + 1);
        reverse(A, 0, max);
      }
      reverse(A, 0, i);
      result.add(i + 1);
    }
    return result;
  }

  public void reverse(int[] nums, int i, int j) {
    if (i == j) {
      return;
    }
    while (i < j) {
      int t = nums[i];
      nums[i] = nums[j];
      nums[j] = t;
      i++;
      j--;
    }
  }
}
