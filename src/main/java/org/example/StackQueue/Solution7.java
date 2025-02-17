package org.example.StackQueue;
import java.util.*;
public class Solution7 {
    public String solution(String order, String plan) {
        String answer = "";
        for (char x : plan.toCharArray()) {
            if (order.contains(String.valueOf(x))) answer += String.valueOf(x);
        }
        return answer.equals(order) ? "YES" : "NO";
    }

    public String teacher(String need, String plan) {
        String answer = "YES";
        Queue<Character> Q = new LinkedList<>();
        for (char x : need.toCharArray()) Q.offer(x);
        for (char x : plan.toCharArray()) {
            if (Q.contains(x)) {
                if (x != Q.poll()) return "NO";
            }
        }
        if (!Q.isEmpty()) return "NO";
        return answer;
    }

    public static void main(String[] args) {
        Solution7 s = new Solution7();
        Scanner in = new Scanner(System.in);
        String order = in.next();
        String plan = in.next();
        System.out.println(s.solution(order, plan));
    }

    public String review1(String order, String plan) {
        String answer = "YES";
        Queue<Character> q = new LinkedList<>();
        for (char x : order.toCharArray()) q.offer(x);
        for (char x : plan.toCharArray()) {
            if (q.contains(x)) {
                if (x != q.poll()) return "NO";
            }
        }
        if (!q.isEmpty()) return "NO";
        return answer;
    }
}
