package org.example.StackQueue;
import java.util.*;
public class Solution6 {
    public int solution(int n, int k) {
        int answer = 0;
        //Queue
        //Q.offer(x) : 넣기
        //Q.poll(x) : 빼기
        //Q.peek(x) : 제일 처음꺼 확인
        //Q.contains(x) : 포함되어있는지
        Queue<Integer> Q = new LinkedList<>();
        for (int i = 1; i <= n; i++) Q.offer(i);
        while (!Q.isEmpty()) {
            for (int i = 1; i < k; i++) Q.offer(Q.poll());
            Q.poll();
            if (Q.size() == 1) return Q.poll();
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution6 s = new Solution6();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        System.out.println(s.solution(n, k));
    }
}
