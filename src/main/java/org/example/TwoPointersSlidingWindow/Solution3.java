package org.example.TwoPointersSlidingWindow;
import java.util.*;
public class Solution3 {
    //Time Limit Exceeded
    public int solution(int n, int k, int[] arr) {
        int answer = 0;
        for (int i = 0; i <= n - k; i++) {
            int sum = 0;
            for (int j = i; j <= i + k - 1; j++) {
                sum += arr[j];
            }
            if (sum > answer) answer = sum;
        }
        return answer;
    }

    public int solution2(int n, int k, int[] arr) {
        int answer = 0, sum = 0;
        for (int i = 0; i < k; i++) sum += arr[i];
        answer = sum;
        for (int i = k; i < n; i++) {
            sum += (arr[i] - arr[i - k]);
            answer = Math.max(sum, answer);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution3 s = new Solution3();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(s.solution2(n, k, arr));
    }

    //마지막 문제 TIME LIMIT
    public int review1(int n, int m, int[] arr) {
        int answer = 0;
        int p1 = 0;
        int p2 = m;
        for (int i = 1; i <= n - m; i++) {
            int max = 0;
            while (p1 < p2) {
                max += arr[p1++];
            }
            p1 = i;
            p2 = i + m;
            answer = Math.max(max, answer);
        }
        return answer;
    }
}
