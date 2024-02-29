import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> l1=new LinkedList<Integer>();
        int a=sc.nextInt();
        while(a!=-1)
        {
            l1.add(a);
            a=sc.nextInt();
        }
        int n=sc.nextInt();
        System.out.println("Given linked list:");
        for(int i:l1)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i=0;i<n;i++)
        {
            l1.add(l1.get(i));
        }
        for(int i=0;i<n;i++)
        {
            l1.remove(0);
        }
        System.out.println("Rotated Linked list:");
        for(int i:l1)
        {
            System.out.print(i+" ");
        }
        
    }
}
