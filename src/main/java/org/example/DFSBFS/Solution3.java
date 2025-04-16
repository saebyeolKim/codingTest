package org.example.DFSBFS;

import java.util.Scanner;

public class Solution3 {

    static int score, n, m;
    public static void main(String[] args) {
        Solution3 s = new Solution3();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        s.DFS(0, 0, 0, a, b);
        System.out.println(score);
    }

    public void DFS(int L, int sum, int time, int[] a, int[] b) {
        if (time > m) return;
        if (L == n) {
            score = Math.max(score, sum);
        } else {
            DFS(L + 1, sum + a[L], time + b[L], a, b);
            DFS(L + 1, sum, time, a, b);
        }
    }
}
