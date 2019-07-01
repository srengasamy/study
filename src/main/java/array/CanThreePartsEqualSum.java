package array;

public class CanThreePartsEqualSum {
  public static void main(String[] args) {
    System.out.println(new CanThreePartsEqualSum().canThreePartsEqualSum(new int[]{3, 3, 6, 5, -2, 2, 5, 1, -9, 4}));
  }

  public boolean canThreePartsEqualSum(int[] A) {
    int sum = 0;
    for (int num : A) {
      sum += num;
    }
    int target = sum / 3;
    int count = 0;
    int sumSoFar = 0;
    for (int num : A) {
      sumSoFar += num;
      if (sumSoFar == target) {
        count++;
        sumSoFar = 0;
      }
    }
    return count == 3;
  }
}
