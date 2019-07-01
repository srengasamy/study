package array;

public class IsMonotonic {

  public static void main(String[] args) {
    System.out.println(new IsMonotonic().isMonotonic(new int[]{1, 1, 1, 1}));
  }

  public boolean isMonotonic(int[] A) {
    int increasing = 0;
    int decreasing = 0;
    for (int i = 0; i < A.length - 1; i++) {
      if (A[i] < A[i + 1]) {
        increasing++;
      } else if (A[i] > A[i + 1]) {
        decreasing++;
      }
    }
    return increasing > 0 && decreasing > 0 ? false : true;
  }
}
