package pointers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumRescueBoats {
  public int numRescueBoats(int[] people, int limit) {
    List<Integer> items = new ArrayList<>();
    for (int p : people) {
      items.add(p);
    }
    Collections.sort(items);
    int count = 0;
    while (!items.isEmpty()) {
      int found = -1;
      int last = items.size() - 1;
      while (last > 0) {
        if (items.get(last) + items.get(0) <= limit) {
          found = last;
          break;
        } else {
          last--;
        }
      }
      count++;
      if (found > -1) {
        items.remove(last);
      }
      items.remove(0);
    }
    return count;
  }

  public static void main(String[] args) {
    System.out.println(new NumRescueBoats().numRescueBoats(new int[]{3,5,3,4}, 5));
  }
}
