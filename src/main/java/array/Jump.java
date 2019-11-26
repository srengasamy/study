package array;

public class Jump {

  public int jump(int[] nums) {
    int count = 0, currEnd = 0, currFar = 0;
    for (int i = 0; i < nums.length-1; i++) {
      currFar = Math.max(i + nums[i], currFar);
      if (currEnd == i) {
        count++;
        currEnd = currFar;
      }
    }
    return count;
  }

  public static void main(String[] args) {
    System.out.println(new Jump().jump(new int[]{2, 3, 1, 1, 4}));
  }
}
