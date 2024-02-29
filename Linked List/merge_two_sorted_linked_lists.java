import java.util.*;

class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int a, b;
    a = sc.nextInt();
    LinkedList<Integer> al = new LinkedList<>();
    LinkedList<Integer> bl = new LinkedList<>();
    LinkedList<Integer> ans = new LinkedList<>();
    for (int i = 0; i<a; i++) {
      al.add(sc.nextInt());
    }
    b = sc.nextInt();
    for (int i = 0; i<b; i++) {
      bl.add(sc.nextInt());
    }
    while (al.size() > 0 && bl.size() > 0) {
      if (al.get(0) >= bl.get(0)) {
        ans.add(bl.get(0));
        bl.remove(0);
      } else {
        ans.add(al.get(0));
        al.remove(0);
      }
    }
    while (al.size() > 0) {
      ans.add(al.get(0));
      al.remove(0);
    }
    while (bl.size() > 0) {
      ans.add(bl.get(0));
      bl.remove(0);
    }
    for (int i : ans) {
      System.out.print(i+"->");
    }
    System.out.print("NULL");
  }
}
