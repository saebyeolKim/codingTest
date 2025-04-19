package org.example.DFSBFS;

import java.util.Scanner;

public class Solution4 {

    static int[] pm;
    static int n, m;
    public static void main(String[] args) {
        Solution4 s = new Solution4();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        pm = new int[m];
        s.DFS(0);
    }

    public void DFS(int L) {
        if (L == m) {
            for (int x : pm) System.out.print(x + " ");
            System.out.println();
        }
        else {
            for (int i = 1; i <= n; i++) {
                pm[L] = i;
                DFS(L + 1);
            }
        }
    }
}
