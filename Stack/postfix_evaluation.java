import java.util.*;

public class Main {
    public static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stk = new Stack<>();
        int n = sc.nextInt();
        sc.nextLine();
        for (int j = 0; j < n; j++) {
            String inp = sc.nextLine();
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
            System.out.println(res);
        }
    }
}
