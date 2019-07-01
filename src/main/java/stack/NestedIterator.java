package stack;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NestedIterator implements Iterator<Integer> {
  Queue<NestedInteger> queue = new LinkedList();

  public NestedIterator(List<NestedInteger> nestedList) {
    for (NestedInteger nested : nestedList) {
      process(nested);
    }
  }

  @Override
  public boolean hasNext() {
    return !queue.isEmpty();
  }

  @Override
  public Integer next() {
    return queue.poll().getInteger();
  }

  private void process(NestedInteger nested) {
    if (nested.isInteger()) {
      queue.add(nested);
      return;
    }
    for (NestedInteger n : nested.getList()) {
      process(n);
    }
  }
}
