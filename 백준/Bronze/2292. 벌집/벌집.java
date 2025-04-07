import java.util.*;

public class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      if (n == 1) {
          System.out.println(1);
          return;
      }
      int index = 1;
      int num = 1;
      while (n > num) {
          num += 6 * index;
          index++;
      }
      System.out.println(index);
  }
}