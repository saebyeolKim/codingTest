package org.example.TwoPointersSlidingWindow;
import java.util.*;
public class Solution5 {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += j;
                if (sum == n) {
                    answer++;
                    break;
                } else if (sum > n) break;
            }
        }
        return answer;
    }

    //연속된 자연수는 n / 2 + 1 까지만 돌면 된다.
    //two pointers algorithms
    public int teacher(int n) {
        int answer = 0, sum = 0, lt = 0;
        int m =  n/ 2 + 1;
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) arr[i] = i + 1;
        for (int rt = 0; rt < m; rt++) {
            sum += arr[rt];
            if (sum == n) answer++;
            while (sum >= n) {
                sum -= arr[lt++];
                if (sum == n) answer++;
            }
        }
        return answer;
    }

    public int teacher2(int n) {
        int answer = 0, cnt = 1;
        n--;
        while (n > 0) {
            cnt++;
            n = n - cnt;
            if (n % cnt == 0) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution5 s = new Solution5();
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        System.out.println(s.review1(input));
    }

    public int review1(int n) {
        int answer = 0, lt = 1, sum = 0;
        for (int rt = 1; rt < n; rt++) {
            sum += rt;
            while (sum >= n) {
                if (sum == n) answer++;
                sum -= lt++;
            }
        }
        return answer;
    }
}
