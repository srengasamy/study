package array;

public class FindMonotone {
  public int findMonotone(String s) {
    int n = s.length();
    int[] rightZeros = new int[n + 1];
    for (int i = n - 1; i > -1; i--) {
      rightZeros[i] = rightZeros[i + 1];
      if (s.charAt(i) == '0') {
        rightZeros[i] += 1;
      }
    }
    int leftOnes = 0;
    int min = rightZeros[0];
    for (int i = 0; i < n; i++) {
      if (s.charAt(i) == '1') {
        leftOnes++;
      }
      int cost = leftOnes + rightZeros[i + 1];
      min = Math.min(cost, min);
    }
    return min;
  }

  public static void main(String[] args) {
    System.out.println(new FindMonotone().findMonotone("11011"));
  }
}
