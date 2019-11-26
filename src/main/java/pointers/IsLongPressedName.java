package pointers;

public class IsLongPressedName {
  public boolean isLongPressedName(String name, String typed) {
    int i = 0, j = 0;
    while (i < name.length() && j < typed.length()) {

    }
    return i == name.length() && j == typed.length();
  }

  public static void main(String[] args) {
    System.out.println(new IsLongPressedName().isLongPressedName("leelee", "lleeelee"));
  }
}
