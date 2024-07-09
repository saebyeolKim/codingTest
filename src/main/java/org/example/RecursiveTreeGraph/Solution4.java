package org.example.RecursiveTreeGraph;

public class Solution4 {
    static int[] fibo;
    public int DFS(int n) {
        //이미 배열에 값이 있으면 그 값을 return 해준다. (메모이제이션)
        if (fibo[n] > 0) return fibo[n];
        //배열에 값을 담아서 배열값을 불러온다. 그러면 시간이 절약된다.
        if (n == 1 || n == 2) return fibo[n] = 1;
        else {
            return fibo[n] = DFS(n - 2) + DFS(n - 1);
        }
    }
    public static void main(String[] args) {
        Solution4 T = new Solution4();
        int n = 45;
        fibo = new int[n + 1];
        T.DFS(n);
        for (int i = 1; i <= n; i++) System.out.println(fibo[i] + " ");
    }
}
