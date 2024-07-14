package org.example.RecursiveTreeGraph;

import java.util.*;

public class Solution8 {
    int answer = 0;
    int[] dis = {1, -1, 5}; //걸음 수
    int[] ch; //체크 배열, 한 번 큐에 들어간 것은 안 넣기 위해
    Queue<Integer> Q = new LinkedList<>();
    public int BFS(int s, int e) {
        ch = new int[10001]; //직선의 좌표가 1 ~ 10,000
        ch[s] = 1;
        Q.add(s);
        int L = 0; //루트 노드 레벨
        while (!Q.isEmpty()) {
            int len = Q.size(); //레벨에 있는 원소의 개수
            for (int i = 0; i < len; i++) {
                int x = Q.poll();
//                if (x == e) return L;
                for (int d : dis) {
                    int nx = x + d;
                    if (nx == e) return L + 1;
                    if (nx >= 1 && nx <= 10000 && ch[nx] == 0) {
                        ch[nx] = 1;
                        Q.add(nx);
                    }
                }
            }
            L++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution8 T = new Solution8();
        Scanner in = new Scanner(System.in);
        int s = in.nextInt(); //현수의 위치
        int e = in.nextInt(); //송아지의 위치
        System.out.println(T.BFS(s, e));
    }
}
