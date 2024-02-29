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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String infix = sc.next();
        String postfix = infixToPostfix(infix);
        System.out.println(postfix);
    }
}
