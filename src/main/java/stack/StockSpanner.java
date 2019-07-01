package stack;

import java.util.Stack;

public class StockSpanner {

  Stack<Integer> values = new Stack<>();
  Stack<Integer> span = new Stack<>();

  public StockSpanner() {

  }

  public int next(int price) {
    int result = 0;
    while (!values.isEmpty() && values.peek() <= price) {
      values.pop();
      result += span.pop();
    }
    values.push(price);
    span.push(result + 1);
    return result + 1;
  }

  public static void main(String[] args) {
    StockSpanner spanner = new StockSpanner();
    System.out.println(spanner.next(28));
    System.out.println(spanner.next(14));
    System.out.println(spanner.next(28));
    System.out.println(spanner.next(35));
    System.out.println(spanner.next(46));
    System.out.println(spanner.next(53));
    System.out.println(spanner.next(66));
    System.out.println(spanner.next(80));
    System.out.println(spanner.next(87));
    System.out.println(spanner.next(88));
  }
}
