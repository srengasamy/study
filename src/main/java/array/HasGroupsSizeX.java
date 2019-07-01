package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HasGroupsSizeX {

  public static void main(String[] args) {
    System.out.println(new HasGroupsSizeX().hasGroupsSizeX(new int[]{1, 1, 2, 2, 2, 2, 2, 2, 3, 3}));
  }

  public boolean hasGroupsSizeX(int[] deck) {
    Map<Integer, Integer> count = new HashMap<>();
    for (int num : deck) {
      int value = count.getOrDefault(num, 0) + 1;
      count.put(num, value);
    }
    return gcd(new ArrayList<>(count.values())) >= 2;

  }

  public int gcd(List<Integer> values) {
    Integer gcd = null;
    for (int num : values) {
      if (gcd == null) {
        gcd = num;
      } else {
        gcd = gcd(gcd, num);
      }
    }
    return gcd;
  }

  public int gcd(int x, int y) {
    if (x == y) {
      return x;
    }
    if (x > y) {
      return gcd(x - y, y);
    }
    return gcd(x, y - x);
  }
}
