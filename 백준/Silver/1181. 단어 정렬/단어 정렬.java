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
    
    List<String> list = new ArrayList<>(set);
    Collections.sort(list, (a, b) -> {
      if (a.length() == b.length()) return a.compareTo(b);
      return a.length() - b.length();
    });
    
    for (String s : list) {
        System.out.println(s);
    }
  }
}