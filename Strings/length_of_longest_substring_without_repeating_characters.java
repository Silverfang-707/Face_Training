import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int i, j, max;
        i = j = max = 0;
        String subs = "";
        while (j < str.length()-1) {
            subs = str.substring(i, j+1);
            if (subs.contains(String.valueOf(str.charAt(j+1)))) {
                max = Math.max(subs.length(), max);
                i++;
            } else {
                j++;
            }
        }
        subs = str.substring(i, j+1);
        max = Math.max(subs.length(), max);
        System.out.println(max);
    }
}
