package array;

public class CanPlaceFlowers {
  public static void main(String[] args) {
    System.out.println(new CanPlaceFlowers().canPlaceFlowers(new int[]{0, 0, 1, 0, 0}, 1));
  }

  public boolean canPlaceFlowers(int[] flowerbed, int n) {
    if(n == 0){
      return true;
    }
    for (int i = 0; i < flowerbed.length; i++) {
      if (flowerbed[i] == 1) {
        continue;
      }
      boolean left = i == 0 || flowerbed[i - 1] == 0;
      boolean right = i == flowerbed.length - 1 || flowerbed[i + 1] == 0;
      if (left && right) {
        n--;
        flowerbed[i] = 1;
        if (n == 0) {
          return true;
        }
      }
    }
    return n == 0;
  }
}
