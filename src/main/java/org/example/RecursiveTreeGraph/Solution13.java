package org.example.RecursiveTreeGraph;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution13 {
    //main 에서 접근해야 되니 static 으로 선언
    static int n, m, answer = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch;
    public void DFS(int v) {
        if (v == n) answer++;
        else {
            for (int nv : graph.get(v)) {
                if (ch[nv] == 0) {
                    ch[nv] = 1;
                    DFS(nv);
                    ch[nv] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Solution13 T = new Solution13();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt(); //노드 개수
        m = kb.nextInt(); //간선 개수
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < m; i++) {
            graph.add(new ArrayList<Integer>());
        }
        ch = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            graph.get(a).add(b);
        }
        ch[1] = 1; //출발점 체크
        T.DFS(1); //출발
        System.out.println(answer);

    }
}
