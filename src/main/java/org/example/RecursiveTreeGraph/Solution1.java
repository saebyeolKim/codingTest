package org.example.RecursiveTreeGraph;

import java.util.*;

public class Solution1 {
    public void DFS(int n) {
        if (n == 0) return;
        else {
//            System.out.print(n + " "); 3 2 1
            DFS(n - 1);
            System.out.print(n + " "); //1 2 3 : 재귀함수는 스택 프레임을 사용
        }
    }
    public static void main(String[] args) {
        Solution1 T = new Solution1();
        T.DFS(3);
    }
}
