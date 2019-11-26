package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMinDifference {
  public int findMinDifference(List<String> timePoints) {
    int min = Integer.MAX_VALUE;
    List<Integer> list = new ArrayList<>();
    for (String point : timePoints) {
      list.add(60 * Integer.valueOf(point.substring(0, 2)) + Integer.valueOf(point.substring(3, 5)));
    }

    Collections.sort(list);
    for (int i = 1; i < list.size(); i++) {
      min = Math.min(min, list.get(i) - list.get(i - 1));
    }

    min = Math.min(min, 1440 - list.get(list.size() - 1) + list.get(0));
    return min;
  }

  public static void main(String[] args) {
    System.out.println(new FindMinDifference().findMinDifference(Arrays.asList("23:59", "00:00")));
  }
}
