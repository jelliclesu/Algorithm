import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        
        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            if (sc.next().equals("enter")) {
                set.add(name);
            } else {
                set.remove(name);
            }
        }
        List<String> list = new ArrayList<>(set);
        Collections.sort(list, (a, b) -> b.compareTo(a));
        
        StringBuilder sb = new StringBuilder();
        for (String s : list) {
            sb.append(s).append("\n");
        }
        System.out.println(sb.toString());
    }
}