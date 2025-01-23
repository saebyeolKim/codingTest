package org.example.Array;
import java.util.*;
public class Solution8 {
    public int[] solution(int n, int[] arr) {
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] > arr[j]) ++answer[j];
            }
        }
        return answer;
    }

    public int[] teacher(int n, int[] arr) {
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            int cnt = 1;
            for (int j = 0; j < n; j++) {
                if (arr[j] > arr[i]) cnt++;
            }
            answer[i] = cnt;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution8 s = new Solution8();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        for (int x : s.review1(n, arr)) {
            System.out.print((x + 1) + " ");
        }
    }

    public int[] review1(int n, int[] arr) {
        int[] answer = new int[n];
        for (int i = 0; i < n - 1; i++) {
            for (int j = i; j < n; j++) {
                if (arr[i] < arr[j]) answer[i]++;
                else if (arr[i] > arr[j]) answer[j]++;
            }
        }
        return answer;
    }
}
