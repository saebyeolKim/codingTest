package org.example.Array;
import java.util.*;
public class Solution7 {
    public int solution(int n, int[] arr) {
        int answer = 0;
        int cur = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) cur = 0;
            else cur++;
            answer += cur;
        }
        return answer;
    }

    public int teacher(int n, int[] arr) {
        int answer = 0, cnt = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                cnt++;
                answer += cnt;
            } else {
                cnt = 0;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution7 s = new Solution7();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(s.review1(n, arr));
    }

    public int review1(int n, int[] arr) {
        int answer = 0;
        int score = 0;
        for (int a : arr) {
            if (a == 1) score++;
            else score = 0;
            answer += score;
        }
        return answer;
    }
}
