package org.example.Array;
import java.util.*;
public class Solution9 {

    public int rowMax(int n, int[][] arr) {
        int max = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += arr[i][j];
            }
            if (sum > max) max = sum;
        }
        return max;
    }

    public int columnMax(int n, int[][] arr) {
        int max = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += arr[j][i];
            }
            if (sum > max) max = sum;
        }
        return max;
    }

    public int downMax(int n, int[][] arr) {
        int max = 0;
        for (int i = 0; i < n; i++) {
            max += arr[i][i];
        }
        return max;
    }

    public int upMax(int n, int[][] arr) {
        int max = 0;
        for (int i = 0; i < n; i++) {
            max += arr[i][n - i - 1];
        }
        return max;
    }

    public int solution(int n, int[][]arr) {
        int answer = Math.max(rowMax(n, arr), columnMax(n, arr));
        answer = Math.max(answer, downMax(n, arr));
        answer = Math.max(answer, upMax(n, arr));
        return answer;
    }

    public static void main(String[] args) {
        Solution9 s = new Solution9();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(s.review1(n, arr));
    }

    public int review1(int n, int[][] arr) {
        int max = 0;
        int sum1, sum2;
        //행과 열
        for (int i = 0; i < n; i++) {
            sum1 = sum2 = 0;
            for (int j = 0; j < n; j++) {
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            max = Math.max(sum1, max);
            max = Math.max(sum2, max);
        }
        //대각선
        sum1 = sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += arr[i][i];
            sum2 += arr[n - 1 - i][i];
            max = Math.max(sum1, max);
            max = Math.max(sum2, max);
        }
        return max;
    }

    public int teacher(int n, int[][]arr) {
        int answer = Integer.MIN_VALUE;
        int sum1, sum2;
        //행과 열의 최대값
        for (int i = 0; i < n; i++) {
            sum1 = sum2 = 0;
            for (int j = 0; j < n; j++) {
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }
        //대각선 최대값
        sum1 = sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += arr[i][i];
            sum2 += arr[i][n - i - 1];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);
        return answer;
    }
}
