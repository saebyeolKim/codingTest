package org.example.Array;
import java.util.*;
public class Solution11 {
    public int solution(int n, int[][]arr) {
        int[] tmp = new int[n];
        for (int i = 0; i < n; i++) {
            String students = i + "";
            for (int j = 0; j < n; j++) {
                int tg = arr[i][j];
                for (int k = 0; k < 5; k++) {
                    if (students.indexOf(k + "") == -1 && tg == arr[k][j]) {
                        students += k;
                        tmp[i]++;
                    }
                }
            }
        }
        int answer = 0;
        for (int i = 1; i < n; i++) {
            if (tmp[i - 1] > tmp[i]) answer = i;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution11 s = new Solution11();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(s.solution(n, arr));
    }

    public int teacher(int n, int[][]arr) {
        int answer = 0, max = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            int cnt = 0;
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= 5; k++) {
                    if (arr[i][k] == arr[j][k]) {
                        cnt++;
                        break;
                    }
                }
                if (cnt > max) {
                    max = cnt;
                    answer = i;
                }
            }
        }
        return answer;
    }

    public static void teacherMain(String[] args) {
        Solution11 s = new Solution11();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n + 1][6];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(s.teacher(n, arr));
    }
}
