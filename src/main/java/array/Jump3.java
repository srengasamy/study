package array;

public class Jump3 {
  public boolean canJump(int[] nums) {
    boolean[] aux = new boolean[nums.length];
    aux[0] = true;
    for (int i = 1; i < nums.length; i++) {
      for (int j = i - 1; j >= 0; j--) {
        if (j + nums[j] >= i && aux[j]) {
          aux[i] = true;
          break;
        }
      }
    }
    return aux[nums.length - 1];
  }

  public static void main(String[] args) {
    System.out.println(new Jump3().canJump(new int[]{3,2,1,0,4}));
  }
}
