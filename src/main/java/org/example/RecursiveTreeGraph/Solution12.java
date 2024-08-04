package org.example.RecursiveTreeGraph;
import java.util.*;
public class Solution12 {
    //main 에서 접근해야 되니 static 으로 선언
    static int n, m, answer = 0;
    static int[][] graph;
    static int[] ch;
    public void DFS(int v) {
        if (v == n) answer++; //v(정점) 가 끝 노드까지 갔으면 가지수 증가
        else {
            for (int i = 1; i <= n; i++) {
                if (graph[v][i] == 1 && ch[i] == 0) {
                    ch[i] = 1;
                    DFS(i);
                    ch[i] = 0; //백트래킹하면서 체크배열에 있는 값 풀어주기
                }
            }
        }
    }

    public static void main(String[] args) {
        Solution12 T = new Solution12();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt(); //노드 개수
        m = kb.nextInt(); //간선 개수
        graph = new int[n + 1][m + 1];
        ch = new int[n + 1]; //체크배열, 방문했냐 안했냐 체크
        for (int i = 0; i < m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            graph[a][b] = 1; //방향그래프, 가중치그래프가 아니니 1로 초기화
        }
        ch[1] = 1; //출발점 체크
        T.DFS(1); //출발
        System.out.println(answer);

    }
}
