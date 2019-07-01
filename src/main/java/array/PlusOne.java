package array;

public class PlusOne {
  public static void main(String[] args) {
    int[] result = new PlusOne().plusOne(new int[]{9, 9, 9});
    System.out.println();
  }

  public int[] plusOne(int[] digits) {
    int remainder = 1;
    for (int i = digits.length - 1; i >= 0 && remainder != 0; i--) {
      if (digits[i] == 9) {
        digits[i] = 0;
        remainder = 1;
      } else {
        digits[i]++;
        remainder = 0;
      }
    }
    if (remainder == 1) {
      int[] result = new int[digits.length + 1];
      result[0] = remainder;
      for (int i = 0; i < digits.length; i++) {
        result[i + 1] = digits[i];
      }
      return result;
    }
    return digits;
  }
}
