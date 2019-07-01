package array;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class AddToArrayForm {
  public static void main(String[] args) {
    System.out.println(new AddToArrayForm().addToArrayForm(new int[]{1, 2, 6, 3, 0, 7, 1, 7, 1, 9, 7, 5, 6, 6, 4, 4, 0, 0, 6, 3}, 516));
  }

  public List<Integer> addToArrayForm(int[] A, int K) {
    StringBuffer sb = new StringBuffer();
    for (int num : A) {
      sb.append(num + "");
    }
    BigInteger num = new BigInteger(sb.toString()).add(BigInteger.valueOf(K));
    List<Integer> result = new ArrayList<>();
    String sum = num.toString();
    for (int i = 0; i < sum.length(); i++) {
      result.add(Integer.valueOf(sum.charAt(i) + ""));
    }
    return result;
  }
}
