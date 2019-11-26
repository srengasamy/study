package dynamic;

public class TallestBillboard {
  public int tallestBillboard(int[] rods) {
    int sum = 0;
    for (int rod : rods) {
      sum += rod;
    }
    boolean[] aux = new boolean[sum + 1];
    aux[0] = true;

  }

  public static void main(String[] args) {
    System.out.println(new TallestBillboard().tallestBillboard(new int[]{1, 2}));
  }
}
