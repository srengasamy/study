package dynamic;

public class UniqueBST {
  public int unique(int n) {
    int[] aux = new int[n + 1];
    aux[0] = 1;
    aux[1] = 1;
    for (int i = 2; i <= n; i++) {
      int sum = 0;
      for (int j = 1; j <= i; j++) {
        sum += aux[j - 1] * aux[i - j];
      }
      aux[i] = sum;
    }
    return aux[n];
  }

  public static void main(String[] args) {
    System.out.println(new UniqueBST().unique(3));
  }
}
