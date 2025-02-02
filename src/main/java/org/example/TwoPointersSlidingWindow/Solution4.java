package org.example.TwoPointersSlidingWindow;
import java.util.*;
public class Solution4 {
    //Time Limit Exceeded
    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == m) {
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }

    public int teacher(int n, int m, int[] arr) {
        int answer = 0, sum = 0, lt = 0;
        for (int rt = 0; rt < n; rt++) {
            sum += arr[rt];
            if (sum == m) answer++;
            while (sum >= m) {
                sum -= arr[lt++];
                if (sum == m) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution4 s = new Solution4();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(s.review1(n, m, arr));
    }

    //첫문제 제외 모든 문제에서 오답이기 때문에 선생님 답안 이해
    public int review1(int n, int m, int[] arr) {
        int answer = 0, lt = 0, sum = 0;
        for (int rt = 0; rt < n; rt++) {
            sum += arr[rt];
            if (sum == m) answer++;
            while (sum >= m) {
                sum -= arr[lt++];
                if (sum == m) answer++;
            }
        }
        return answer;
    }
}
