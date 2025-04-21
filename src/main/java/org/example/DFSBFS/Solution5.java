package org.example.DFSBFS;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Solution5 {

    static Integer[] arr;
    static int n, m, answer = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Solution5 s = new Solution5();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        m = sc.nextInt();
        s.DFS(0, 0);
        System.out.println(answer);
    }

    public void DFS(int L, int sum) {
        if (sum > m) return;
        if (L >= answer) return;
        if (sum == m) answer = Math.min(answer, L);
        else {
            for (int i = 0; i < n; i++) {
                DFS(L + 1, sum + arr[i]);
            }
        }
    }
}
