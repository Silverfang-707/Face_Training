import java.util.*;
class Main
{
  
    public static int longestValidParentheses(String s) {
    int leftCount = 0;
    int rightCount = 0;
    int maxLength = 0;
  
    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == '(') {
            leftCount++;
        } else {
            rightCount++;
        }
        
        if (leftCount == rightCount) {
            maxLength = Math.max(maxLength, 2 * rightCount);
        } 
        else if (rightCount > leftCount) {
            leftCount = rightCount = 0;
        }
    }
    
    leftCount = rightCount = 0;
    
    for (int i = s.length() - 1; i >= 0; i--) {
        if (s.charAt(i) == '(') {
            leftCount++;
        } 
        else {
            rightCount++;
        }
        
        if (leftCount == rightCount) {
            maxLength = Math.max(maxLength, 2 * leftCount);
        } 
        else if (leftCount > rightCount) {
            leftCount = rightCount = 0;
        }
    }
    
    return maxLength;
    }
    public static Boolean check(String str)
    {
     Stack<Character> st = new Stack<>();
        int n = 0;
        for(Character i : str.toCharArray())
        {
            System.out.println(i);
            if(i == '(')
            {
                st.push(')');
            }
            else if (i == '{')
            {
                st.push('}');
            }
            else if (i == '[')
            {
                st.push(']');
            }
            else if (st.isEmpty() || st.pop() != i)
            {
                return false;
            }
          	n++;
          System.out.println(n);
        }
        
        return st.isEmpty();
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(longestValidParentheses(str));
    }
}
