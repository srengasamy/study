package search;

public class FindDuplicate {
  public static void main(String[] args) {
    int[] nums = {1, 2, 3, 4, 4, 4, 4, 4, 5, 6, 7, 8, 8, 9, 10};
    int i = 0;
    int j = nums.length - 1;
    int k = 4;
//    System.out.println(findLast(nums, 4));
    System.out.println((findLast(nums, 4) - findFirst(nums, 4)) + 1);
  }

  public static int findLast(int[] nums, int k) {
    int first = 0;
    int last = nums.length - 1;
    while (first <= last) {
      if (first == last) {
        if (nums[first] == k) {
          return first;
        }
        return -1;
      }
      if (first + 1 == last) {
        if (nums[first] == nums[last] && nums[first] == k) {
          return last;
        }
      }
      int mid = (first + last) / 2;
      if ((mid == last && nums[mid] == k) || (nums[mid] == k && nums[mid + 1] > k)) {
        return mid;
      }
      if (nums[mid] > k) {
        last = mid;
      } else {
        first = mid;
      }
    }
    return -1;
  }

  public static int findFirst(int[] nums, int k) {
    int first = 0;
    int last = nums.length - 1;
    while (first <= last) {
      if (first == last) {
        if (nums[first] == k) {
          return first;
        }
        return -1;
      }
      if (first + 1 == last) {
        if (nums[first] == nums[last] && nums[first] == k) {
          return first;
        }
      }
      int mid = (first + last) / 2;
      if ((first == mid && nums[mid] == k) || (nums[mid] == k && nums[mid - 1] < k)) {
        return mid;
      }
      if (nums[mid] >= k) {
        last = mid;
      } else {
        first = mid;
      }
    }
    return -1;
  }
}
