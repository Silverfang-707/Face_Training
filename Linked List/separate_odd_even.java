import java.util.*;
class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> odd = new LinkedList<>();
        LinkedList<Integer> even = new LinkedList<>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            l1.add(sc.nextInt());
        }
        for(int i=0; i<n;i++){
            if(i%2==0){
                even.add(l1.get(i));
            }
            else{
                odd.add(l1.get(i));
            }
        }
        for(int i=0; i<even.size();i++){
            System.out.print(even.get(i)+" ");
        }
        for(int i=0; i<odd.size();i++){
            System.out.print(odd.get(i)+" ");
        }
    }
}
