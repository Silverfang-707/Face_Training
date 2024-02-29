import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> l1=new LinkedList<Integer>();
        LinkedList<Integer> l2=new LinkedList<Integer>();
        LinkedList<Integer> l3=new LinkedList<Integer>();
        int a=sc.nextInt();
        int i=0;
        while(a!=-1)
        {
            l1.add(a);
            a=sc.nextInt();
        }
        int k=sc.nextInt();
        for(i=0;i<l1.size();i++)
        {
            if((i+k)<=l1.size())
            {
                for(int j=i;j<i+k;j++)
                {
                    l2.add(l1.get(j));
                }
                Collections.reverse(l2);
                l3.addAll(l2);
                l2.clear();
                i+=k-1;
            }
            else
                break;
        }
        for(int j=i;j<l1.size();j++)
        {
            l3.add(l1.get(j));
        }
        for(int y:l3)
        {
            System.out.println(y);
        }
    }
}
