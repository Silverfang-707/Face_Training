import java.util.*;

class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    List<String> ans = new ArrayList<>();
    ans = permute(s, 0, s.length()-1, ans);
    Collections.sort(ans);
    for (String x : ans) {
      System.out.println(x);
    }
  }
  
  static List<String> permute(String s, int l , int r, List<String> ans) {
    if (l == r) {
      ans.add(s);
      return ans;
    }
    for (int i = l; i <= r; i++) {
      s = swap(s, l, i);
      ans = permute(s, l+1, r, ans);
      s = swap(s, l, i);
    }
    return ans;
  }
  static String swap(String s, int i, int j) {
    char temp;
    char[] charArray = s.toCharArray();
    temp = charArray[i];
    charArray[i] = charArray[j];
    charArray[j] = temp;
    return String.valueOf(charArray);
  }
}
