package stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.function.BiFunction;

public class EvalRPN {

  public static void main(String[] args) {
    System.out.println(new EvalRPN().evalRPN(new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"}));
  }

  public int evalRPN(String[] tokens) {
    Map<String, BiFunction<Integer, Integer, Integer>> map = new HashMap<>();
    map.put("+", (a, b) -> a + b);
    map.put("-", (a, b) -> a - b);
    map.put("*", (a, b) -> a * b);
    map.put("/", (a, b) -> a / b);
    Stack<Integer> stack = new Stack<>();
    for (String token : tokens) {
      if (map.containsKey(token)) {
        int b = stack.pop();
        int a = stack.pop();
        stack.push(map.get(token).apply(a, b));
      } else {
        stack.push(Integer.parseInt(token));
      }
    }
    return stack.pop();
  }
}
