package array;

public class FindKthOfTwoSorted {
  public static void main(String[] args) {
    int nums1[] = {1, 2, 4, 6, 7, 8, 9};
    int nums2[] = {2, 4, 5, 6};
    int k = 6;


  }

  public int findK(int[] nums1, int[] nums2) {
    int mid1 = nums1.length / 2;
    int mid2 = nums2.length / 2;
    if (mid1 == mid2) {
      return Math.min(nums1[mid1], nums2[mid2]);
    }
    if (nums1[mid1] < nums2[mid1]) {

    }
    return 1;
  }
}
