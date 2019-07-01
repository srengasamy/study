package array;

public class MajorityElement {

  public static void main(String[] args) {
    System.out.println(new MajorityElement().majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
  }

  public int majorityElement(int[] nums) {
    int count = 0;
    int result = Integer.MIN_VALUE;
    for (int i = 0; i < nums.length; i++) {
      if (count == 0) {
        result = nums[i];
        count++;
        continue;
      }
      if (result == nums[i]) {
        count++;
      } else {
        count--;
      }
    }
    return result;
  }
}
