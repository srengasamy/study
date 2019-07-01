package array;

public class ValidMountainArray {
  public static void main(String[] args) {
    System.out.println(new ValidMountainArray().validMountainArray(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}));
  }

  public boolean validMountainArray(int[] A) {
    if (A.length < 3 || A[0] > A[1]) {
      return false;
    }
    int i = 0;
    while (i < A.length - 1 && A[i] < A[i + 1]) {
      i++;
    }
    if (i == A.length - 1) {
      return false;
    }
    while (i < A.length - 1 && A[i] > A[i + 1]) {
      i++;
    }
    return i == A.length - 1;
  }
}
