package org.example.DFSBFS;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Solution6 {

    static int n, m;
    static int[] pm, arr, ch;
    public static void main(String[] args) {
        Solution6 s = new Solution6();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        pm = new int[m];
        ch = new int[n];
        s.DFS(0);
    }

    public void DFS(int L) {
        if (L == m) {
            for (int x : pm) System.out.print(x + " ");
            System.out.println();
        }
        else {
            for (int i = 0; i < n; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    pm[L] = arr[i];
                    DFS(L + 1);
                    ch[i] = 0;
                }
            }
        }
    }
}
