import java.util.*;
public class Main {
    public static boolean isOperator(char c){
        return c=='+' || c=='-' || c=='*' || c=='/' || c=='^';
    }
    public static int getPrecedence(char c){
        if(c=='+' || c=='-') return 1;
        else if(c=='*' || c=='/' || c=='%') return 2;
        else if(c=='^') return 3;
        else return 0;
    }
    
    public static String infixToPostfix(String infix){
        String postfix = "";
        int len = infix.length();
        Stack<Character> s = new Stack<>();
        char c;
        for(int i = 0; i<len; i++){
            c = infix.charAt(i);
            if(isOperator(c)){
                while(!s.empty() && getPrecedence(c)<=getPrecedence(s.peek())){
                    postfix+=s.peek();
                    s.pop();
                }
                s.push(c);
            }
            else if(c=='('){
                s.push(c);
            }
            else if(c==')'){
                while(!s.empty() && s.peek()!='('){
                    postfix+=s.peek();
                    s.pop();
                }
                s.pop();
            }
            else postfix+=c;
        }
        while(!s.empty()){
            if(s.peek()=='(') return "Invalid Expression";
            postfix += s.peek();
            s.pop();
        }
        return postfix;
    }
    
    public static int posteval(String inp){
        Stack<Integer> stk = new Stack<>();
        int res = 0;
        for (int i = 0; i < inp.length(); i++) {
            char inpchar = inp.charAt(i);
            if (!isOperator(inpchar)) {
                int inpint = Integer.parseInt(String.valueOf(inp.charAt(i)));
                stk.push(inpint);
            } else {
                int temp = stk.pop();
                int temp2 = stk.pop();
                if (inpchar == '+') {
                    res = temp + temp2;
                } else if (inpchar == '-') {
                    res = temp2 - temp;
                } else if (inpchar == '*') {
                    res = temp * temp2;
                } else if (inpchar == '/') {
                    res = temp2 / temp;
                } else if (inpchar == '^') {
                    res = temp2 ^ temp;
                }
                stk.push(res);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String infix = sc.next();
        String postfix = infixToPostfix(infix);
        int ans = posteval(postfix);
        System.out.println(ans);
    }
}
