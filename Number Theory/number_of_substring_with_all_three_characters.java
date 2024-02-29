import java.util.*;

class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println(durr(0,3,sc.nextLine()));
        
    }
    
    static int durr(int start, int end, String str) {
        if (end > str.length() || start >= str.length() || end <= start+2) {
            return 0;
        }
        String sub = str.substring(start, end);
        if (sub.contains("a") && sub.contains("b") && sub.contains("c")) {
            if (sub.length() == 3) {
                return durr(start+1, end+1, str) + str.length() - end + 1;
            }
            return durr(start+1, end, str) + str.length() - end + 1;
        } else {
            return durr(start, end+1, str);
        }
    }
}
