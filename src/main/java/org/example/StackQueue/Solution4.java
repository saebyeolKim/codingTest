package org.example.StackQueue;
import java.util.*;
public class Solution4 {
    public int solution(String str) {
        Stack<Integer> st = new Stack<>();
        for (char x : str.toCharArray()) {
            if (Character.isDigit(x)) st.push(x - 48);
            else {
                int rt = st.pop();
                int lt = st.pop();
                if (x == '+') st.push(lt + rt);
                else if (x == '-') st.push(lt - rt);
                else if (x == '*') st.push(lt * rt);
                else if (x == '/') st.push(lt / rt);
            }
        }
        return st.get(0);
    }

    public static void main(String[] args) {
        Solution4 s = new Solution4();
        Scanner in = new Scanner(System.in);
        String input = in.next();
        System.out.println(s.solution(input));
    }
}
