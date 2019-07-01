package array;

public class FindDuplicate {

  public int findDuplicate(int[] nums) {
    int s = nums[0];
    int f = nums[0];
    do {
      f = nums[nums[f]];
      s = nums[s];
    } while (nums[s] != nums[f]);
    int p1 = nums[0];
    int p2 = s;
    while (p1 != p2) {
      p1 = nums[p1];
      p2 = nums[p2];
    }
    return p1;
  }

  public static void main(String[] args) {
    System.out.println(new FindDuplicate().findDuplicate(new int[]{7, 9, 7, 4, 2, 8, 7, 7, 1, 5}));
//    System.out.println(new FindDuplicate().findDuplicate(new int[]{1, 3, 4, 2, 2}));

  }
}
