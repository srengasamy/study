package array;

public class RemoveDuplicates2 {
  public int removeDuplicates(int[] nums) {
    int last = -1, count = 1;
    for (int num : nums) {
      if (last == -1 || nums[last] != num) {
        nums[++last] = num;
        count = 1;
      } else {
        if (count == 1) {
          nums[++last] = num;
          count++;
        } else {
          continue;
        }
      }
    }
    return last + 1;
  }

  public static void main(String[] args) {
    int[] nums = {0,0,1,1,1,1,2,3,3};
    int len = new RemoveDuplicates2().removeDuplicates(nums);
    for (int i = 0; i < len; i++) {
      System.out.println(nums[i]);
    }
  }
}
