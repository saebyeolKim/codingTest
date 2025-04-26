package org.example.DFSBFS;

import java.util.Scanner;

public class Solution8 {

    //3 + 1 + 1 + 1 + 2 + 2 + 2 + 4
    //1       3           3       1
    //(3 * 1) + (1 * 3) + (2 * 3) + (4 * 1) = 16 : 순열을 곱한 값이 final number 인지 보면 됨
    //3C0 3C1 3C2 3C3

    //예를 들어 n == 5, f == 26
    //1 2 3 4 5
    //(1 * 4C0) + (2 * 4C1) + (3 * 4C2) + (4 * 4C3) + (5 * 4C4)
    //   1           4           6           4           1
    //위의 숫자를 b라는 배열로 미리 말들어 놓고,
    //p 라는 배열을 만들어 b 배열과 곱한다. 곱해서 합한 값이 final number 라면 멈춘다.
    static int[] b, p, ch;
    static int n, f;
    boolean flag = false;
    int[][] dy = new int[35][35];
    public int combi(int n, int r) {
        if (dy[n][r] > 0) return dy[n][r];
        if (n == r || r == 0) return 1;
        else return dy[n][r] = combi(n - 1, r - 1) + combi(n - 1, r);
    }

    public void DFS(int L, int sum) {
        if (flag) return;
        if (L == n) {
            if (sum == f) {
                for (int x : p) System.out.print(x + " ");
                flag = true; //백트래킹으로 인해 값이 출력되는 것을 방지하기 위함
            }
        } else {
            for (int i = 1; i <= n; i++) { //인덱스 번호가 아닌, 실제로 곱할 숫자
                if (ch[i] == 0) {
                    ch[i] = 1;
                    p[L] = i;
                    DFS(L + 1, sum + (p[L] * b[L]));
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Solution8 s = new Solution8();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        f = sc.nextInt();
        b = new int[n];
        p = new int[n];
        ch = new int[n + 1];
        for (int i = 0; i < n; i++) {
            b[i] = s.combi(n - 1, i); // 3C0, 3C1, 3C2, 3C3 구하기 위함.
        }
        s.DFS(0, 0);
    }


}
