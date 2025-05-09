import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
      
    Set<String> set = new HashSet<>();
    for (int i = 0 ;i < n; i++) {
      set.add(sc.nextLine());
    }
    
    String[] arr = set.toArray(new String[0]);
    Arrays.sort(arr, (a, b) -> {
      if (a.length() == b.length()) return a.compareTo(b);
      return a.length() - b.length();
    });
    
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
}