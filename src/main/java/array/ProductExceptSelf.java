package array;

public class ProductExceptSelf {
  public static void main(String[] args) {
    int[] res = new ProductExceptSelf().productExceptSelf(new int[]{1, 0});
    for (int n : res) {
      System.out.println(n);
    }
  }

  public int[] productExceptSelf(int[] nums) {
   return nums;
  }
}
