package stack;

import java.util.Stack;

public class ProcessInfix {
  public static void main(String[] args) {
    String input = "5+6 - (1+2) * 6";
    Stack<Integer> operand = new Stack<>();
    Stack<Character> operator = new Stack<>();
    for (int i = 0; i < input.length(); i++) {
      char c = input.charAt(i);
      if (c == ' ') {
        continue;
      }
      if (c >= '0' && c <= '9') {
        operand.push(c - '0');
      } else if (c == '(') {
        operator.push(c);
      } else if (c == ')') {
        while (!operator.isEmpty()) {
          char op = operator.pop();
          if (op == '(') {
            break;
          }
          operand.push(perform(operand.pop(), operand.pop(), op));
        }
      } else {
        while (!operator.isEmpty() && (operator.peek() == '*' || operator.peek() == '/') && (c == '+' || c == '-')) {
          operand.push(perform(operand.pop(), operand.pop(), operator.pop()));
        }
        operator.push(c);
      }
    }
    while (!operator.isEmpty()) {
      operand.push(perform(operand.pop(), operand.pop(), operator.pop()));
    }
    System.out.println(operand.pop());
  }

  public static int perform(int a, int b, char c) {
    if (c == '+') {
      return a + b;
    } else if (c == '-') {
      return a - b;
    } else if (c == '*') {
      return a * b;
    } else if (c == '/') {
      return a / b;
    }
    return -1;
  }
}
