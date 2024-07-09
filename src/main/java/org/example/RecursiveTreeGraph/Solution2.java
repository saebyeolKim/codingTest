package org.example.RecursiveTreeGraph;

public class Solution2 {
    public void DFS(int n) {
        if (n == 0) return;
        else {
            DFS(n / 2);
            System.out.print(n % 2);
        }
    }
    public static void main(String[] args) {
        Solution2 T = new Solution2();
        T.DFS(11);
    }
}
