package stack;

public class AsteroidCollision {
  public int[] asteroidCollision(int[] asteroids) {
    int top = -1;
    for (int i = 0; i < asteroids.length; ) {
      if (top == -1 || asteroids[i] > 0) {
        asteroids[++top] = asteroids[i++];
      } else if (asteroids[top] < 0) {
        asteroids[++top] = asteroids[i++];
      } else {
        if (Math.abs(asteroids[top]) == Math.abs(asteroids[i])) {
          top--;
          i++;
        } else if (Math.abs(asteroids[top]) < Math.abs(asteroids[i])) {
          top--;
        } else {
          i++;
        }
      }
    }
    int[] result = new int[top + 1];
    System.arraycopy(asteroids, 0, result, 0, top + 1);
    return result;
  }

  public static void main(String[] args) {
    int[] result = new AsteroidCollision().asteroidCollision(new int[]{-2, -1, 1, 2});
    System.out.println(result);
  }
}
