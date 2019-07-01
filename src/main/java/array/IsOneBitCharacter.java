package array;

public class IsOneBitCharacter {
  public static void main(String[] args) {
    System.out.println(new IsOneBitCharacter().isOneBitCharacter(new int[]{0, 1, 0, 0}));
  }

  public boolean isOneBitCharacter(int[] bits) {
    StringBuffer sb = new StringBuffer();
    for (int i = 0; i < bits.length - 1; i++) {
      sb.append(bits[i] + "");
    }
    String num = sb.toString();
    if (isValid(num)) {
      return true;
    }
    return isValid(num + bits[bits.length - 1]);
  }

  public boolean isValid(String num) {
    if (num.isEmpty() || num.equals("0")) {
      return true;
    }
    if (num.startsWith("11") || num.startsWith("10") || num.startsWith("00")) {
      return isValid(num.substring(2));
    }
    if (num.equals("0")) {
      return true;
    }
    return false;
  }
}
