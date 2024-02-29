import java.util.*;

class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    int c, val;
    c = 0;
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    LinkedList<Integer> ll = new LinkedList<>();
    while (c != n) {
      val = sc.nextInt();
      if (val == -1) {
        c++;
        continue;
      }
      ll.add(val);
    }
    Collections.sort(ll);
    for(int i=0;i<ll.size();i++){
    	System.out.print(ll.get(i)+" ");
    }
  }
}
