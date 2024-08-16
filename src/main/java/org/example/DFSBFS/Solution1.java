package org.example.DFSBFS;
import java.util.*;
public class Solution1 {
    static String answer = "NO";
    static int n, total = 0;
    boolean flag = false;

    public void DFS(int L, int sum, int[] arr) { //L: 레벨, sum: 부분집합의 합
        if (flag) return;
        if (sum > total / 2) return;
        if (L == n) {
            if (total - sum == sum) {
                answer = "YES";
                flag = true;
            }
        } else {
            DFS(L + 1, sum + arr[L], arr); //배열에 있는 원소를 사용하겠다.
            DFS(L + 1, sum, arr); //배열에 있는 원소를 사용하지 않겠다.
        }
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }
        s.DFS(0, 0, arr);
        System.out.println(answer);
    }
}

