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
        System.out.println(s.review1(input));
    }

    public int review1(String s) {
        Stack<Integer> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) st.add(c- 48);
            else {
                int rt = st.pop();
                int lt = st.pop();
                if (c == '+') st.add(lt + rt);
                else if (c == '-') st.add(lt - rt);
                else if (c == '*') st.add(lt * rt);
                else if (c == '/') st.add(lt / rt);
            }
        }
        return st.get(0);
    }
}
