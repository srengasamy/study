package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Deserialize {

  public NestedInteger deserialize(String s) {
    Stack<NestedInteger> stack = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (Character.isDigit(c) || c == '-') {
        int j = i;
        while (j + 1 < s.length() && Character.isDigit(s.charAt(j+1))) {
          j++;
        }
        NestedInteger integer = new NestedInteger(Integer.parseInt(s.substring(i, j + 1)));
        if (stack.isEmpty()) {
          return integer;
        }
        i = j;
        stack.peek().getList().add(integer);
      } else if (c == '[') {
        stack.push(new NestedInteger());
      } else if (c == ']') {
        NestedInteger top = stack.pop();
        if (stack.isEmpty()) {
          return top;
        } else {
          stack.peek().getList().add(top);
        }
      }
    }
    return stack.pop();
  }

  public static void main(String[] args) {
    Deserialize deserialize = new Deserialize();
    NestedInteger nested = deserialize.deserialize("[123,456,[788,799,833],[[]],10,[]]");
    System.out.println(nested);
  }

  public static class NestedInteger {
    public int val;
    public List<NestedInteger> list = new ArrayList<>();
    public boolean isInteger;

    public NestedInteger(int val) {
      this.val = val;
      this.isInteger = true;
    }

    public NestedInteger() {

    }

    public void setInteger(int value) {
      this.val = value;
    }

    public Integer getInteger() {
      return val;
    }

    public boolean isInteger() {
      return isInteger;
    }

    public List<NestedInteger> getList() {
      return list;
    }
  }
}
