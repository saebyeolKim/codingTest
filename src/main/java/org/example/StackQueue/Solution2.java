package org.example.StackQueue;
import java.util.*;
public class Solution2 {
    public String solution(String str) {
        String answer = "";
        Stack<Character> aStack = new Stack<>(); //알파벳
        Stack<Character> bStack = new Stack<>(); //괄호
        int lt = 0, rt = 0;
        for (char x : str.toCharArray()) {
            if (Character.isAlphabetic(x)) aStack.push(x);
            else bStack.push(x);
//            if (x == '(')
        }
            return answer;
    }

    public String teacher(String str) {
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for (char x : str.toCharArray()) {
            if (x == ')') {
                while (stack.pop() != '(');
            } else stack.push(x);
        }
        for (int i = 0; i < stack.size(); i++) answer += stack.get(i);
        return answer;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        Scanner in = new Scanner(System.in);
        String input = in.next();
        System.out.println(s.teacher(input));
    }
}
