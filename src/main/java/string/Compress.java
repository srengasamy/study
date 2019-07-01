package string;

public class Compress {

  public int compress(char[] chars) {
    return 1;
  }

  public static void main(String[] args) {
    char[] chars = new char[]{'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
    int result = new Compress().compress(chars);
    for (int i = 0; i < result; i++) {
      System.out.println(chars[i]);
    }
  }
}
