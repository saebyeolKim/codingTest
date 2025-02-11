package org.example.StackQueue;
import java.util.*;
public class Solution1 {
    public String solution(String str) {
        if (str.charAt(0) == ')') return "NO";
        Stack<Character> st = new Stack<>();
        st.push(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            if (!st.isEmpty() && st.peek() == '(' && str.charAt(i) == ')') st.pop();
            else st.push(str.charAt(i));
        }
        return st.size() > 0 ? "NO" : "YES";
    }

    public String teacher(String str) {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for (char x : str.toCharArray()) {
            if (x == '(') stack.push(x);
            else {
                if (stack.isEmpty()) return "NO";
                stack.pop();
            }
        }
        if (!stack.isEmpty()) return "NO";
        return answer;
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        Scanner in = new Scanner(System.in);
        String input = in.next();
        System.out.println(s.review1(input));
    }

    public String review1(String s) {
        if (s.charAt(0) == ')') return "NO";
        Stack<Character> stack = new Stack<>();
        stack.add(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (!stack.isEmpty() && stack.peek() == '(' && s.charAt(i) == ')') stack.pop();
            else stack.add(s.charAt(i));
        }
        return stack.size() > 0 ? "NO" : "YES";
    }
}
