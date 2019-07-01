package dynamic;

import java.util.Arrays;
import java.util.List;

public class Triangle {
  public int triangle(List<List<Integer>> nums) {
    return 1;
  }

  public static void main(String[] args) {
    List<List<Integer>> nums = Arrays.asList(Arrays.asList(2), Arrays.asList(3, 4), Arrays.asList(6, 5, 7), Arrays.asList(4, 1, 8, 3));
    System.out.println(new Triangle().triangle(nums));
  }
}
