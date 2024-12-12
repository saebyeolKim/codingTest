package org.example.DFSBFS;

import java.util.Scanner;

public class Solution2 {

    static int answer = Integer.MIN_VALUE, c, n;
    public void DFS(int L, int sum, int[] arr) {
        if (sum > c) return;
        if (L == n) { //L 이 바둑이 마리 수가 되었을 때
            answer = Math.max(answer, sum); //가장 최대 값
        } else {
            DFS(L + 1 , sum + arr[L], arr);
            DFS(L + 1, sum, arr);
        }
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt(); //트럭 무게
        n = sc.nextInt(); //마리 수
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        s.DFS(0, 0, arr); //재귀
        System.out.println(answer);
    }
}

