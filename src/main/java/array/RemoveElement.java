package array;

public class RemoveElement {

  public static void main(String[] args) {
    int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
    int n = new RemoveElement().removeElement(nums, 2);
    for (int i = 0; i < n; i++) {
      System.out.print(nums[i] + " ");
    }
  }

  public int removeElement(int[] nums, int val) {
    int i = -1;
    for (int j = 0; j < nums.length; j++) {
      if (nums[j] != val) {
        nums[++i] = nums[j];
      }
    }
    return i + 1;
  }
}
