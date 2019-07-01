package dynamic;

public class SuperEggDrop {

  public int superEggDrop(int e, int f) {
    if (e == 1) {
      return f;
    }
    int result = Integer.MIN_VALUE;
    for (int i = 1; i <= f; i++) {
      int local = 1 + Math.min(superEggDrop(e - 1, i - 1), superEggDrop(e, f - i));
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(new SuperEggDrop().superEggDrop(2, 100));
  }
}
