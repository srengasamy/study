package array;

public class MissingNumber {
  public static void main(String[] args) {
    System.out.println(new MissingNumber().missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));
  }

  public int missingNumber(int[] nums) {
    int sum = (nums.length * (nums.length + 1)) / 2;
    for (int num : nums) {
      sum -= num;
    }
    return sum;
  }

}
