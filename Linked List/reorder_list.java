import java.util.*;
class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList <Integer>list = new LinkedList<>();
        LinkedList <Integer>list2 = new LinkedList<>();
        int n = (sc.nextInt()-1);
        for(int i = 0; i<=n; i++){
            list.add(sc.nextInt());
        }
        int i=0;
        while(i<n){
            list2.add(list.get(n-i));
            list2.add(list.get(i));
            i++;
        }
        for(int j = 0;j<=n;j++){
            System.out.print(list2.get(j)+" ");
        }
    }
}
