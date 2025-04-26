package org.example.DFSBFS;

import java.util.Scanner;

public class Solution7 {

    int[][] dy = new int[35][35];
    public static void main(String[] args) {
        Solution7 s = new Solution7();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(s.DFS(n , r));
    }

    public int DFS(int n, int r) {
        if (dy[n][r] > 0) return dy[n][r];
        if (r == 0 || n == r ) return 1;
        else return dy[n][r] = DFS(n - 1, r - 1) + DFS(n - 1, r);
    }
}
