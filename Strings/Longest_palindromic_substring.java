import java.util.*;

class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int n = s.length()*2 + 3;
    String temp = "#";
    for (int i = 0; i < s.length(); i++) {
      temp += "#";
      temp += s.charAt(i);
    }
    temp += "#@";
    //System.out.println(temp);
    int max, ind, k, count;
    max = k = count = 0;
    ind = -1;
    for (int j = 1; j < n-1; j++) {
      k = 1;
      count = 0;
      //System.out.println("j: "+j);
      while (j+k < n && j-k >= 0) {
        //System.out.println("j+k: "+(j+k)+" j-k: "+(j-k));
        if (temp.charAt(j-k) == temp.charAt(j+k)) {
          count++;
        } else {
          if (count > max) {
            max = count;
            ind = j;
          }
          break;
        }
        k++;
      }
    }
    System.out.println(s.substring((ind-1-max)/2, (ind-1+max)/2));
  }
}
