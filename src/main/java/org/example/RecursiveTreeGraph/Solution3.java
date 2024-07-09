package org.example.RecursiveTreeGraph;

public class Solution3 {
    public int DFS(int n) {
        if (n == 1) return 1;
        else return n * DFS(n - 1);
    }
    public static void main(String[] args) {
        Solution3 T = new Solution3();
        System.out.println(T.DFS(5));
    }
}
