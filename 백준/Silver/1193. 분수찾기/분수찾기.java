import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    
    int mo = 1, ja = 1, count = 1;
    
    while (x != count) {
      mo++;
      count++;
      if (count == x) break;
      while (mo > 1 && x != count) {
        mo--;
        ja++;
        count++;
      }
      if (count == x) break;
      ja++;
      count++;
      if (count == x) break;
      while (ja > 1 && x != count) {
        mo++;
        ja--;
        count++;
      }
    }
    System.out.println(ja + "/" + mo);
  }
}