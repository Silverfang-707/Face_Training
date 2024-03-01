import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String test = sc.nextLine();
        List<String> l1 = new ArrayList<>();
        List<String> l2 = new ArrayList<>();
        for (int i = 0; i < test.length(); i++) {
            l1.add(test.substring(i + 1)); 
            l2.add(test.substring(0, i)); 
        }
        String ans = "";
        int max = 0;
        for (String comp : l1) {
            if (l2.contains(comp)) {
                if (comp.length() > max) {
                    max = comp.length();
                    ans = comp;
                }
            }
        }
        System.out.println(ans);
    }
}
