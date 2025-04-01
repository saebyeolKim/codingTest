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
        System.out.println(T.review(s, e));
    }

    //최소 횟수로 ~ 를 구해라 최단거리 알고리즘 (BFS : 상태트리 ) 활용해야함
    //5라는(현수의 위치) 지점이 root 값.
    //-1, 1, 5 세갈래로 나누기
    //5                                   - 0Level
    //4             6           10        - 1Level
    //3    9      7   11        15        - 2Level 체크 배열을 만들어서 이미 있는 값은 만들지 않기로 함.
    //2 8  14    12   17      16 20       - 3Level 14발견!

    int reviewAnswer = 0;
    int[] reviewDis = {-1, 1, 5};
    int[] reviewCh;
    Queue<Integer> reviewQ = new LinkedList<>();
    public int review(int s, int e) {
        reviewCh = new int[10001];
        reviewCh[s] = 1;
        reviewQ.add(s);
        int L = 0;
        while(!reviewQ.isEmpty()) {
            int len = reviewQ.size();
            for (int i = 0; i < len; i++) {
                int x = reviewQ.poll();
                for (int j : reviewDis) {
                    int nx = x + j; //자식노드
                    if (nx == e) return L + 1;
                    if (nx >= 1 && nx <= 10000 && reviewCh[nx] == 0) { //아직 방문안했는지 확인
                        reviewCh[nx] = 1;
                        reviewQ.add(nx);
                    }
                }
            }
            L++;
        }
        return reviewAnswer;
    }
}
