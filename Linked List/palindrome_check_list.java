import java.util.*;
public class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList <Integer> ll = new LinkedList<>();
        Stack <Integer> stk = new Stack<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int temp = sc.nextInt();
            ll.add(temp);
            stk.push(temp);
        }
        for(int i=0;i<n;i++){
            if(ll.get(i) == stk.pop()){
                continue;
            }
            else{
                System.out.println("False");
                return;
            }
        }
        System.out.println("True");
    }
}
