package org.example.Array;
import java.util.*;
public class Solution2 {
    public int solution(int n, int[] arr) {
        int answer = 1;
        int max = arr[0];
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] < arr[i + 1] && max < arr[i + 1]) {
                answer++;
                max = arr[i + 1];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(s.review1(arr));
    }

    public int teacher(int n, int[] arr) {
        int answer = 1, max = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                answer++;
                max = arr[i];
            }
        }
        return answer;
    }

    public int review1(int[] arr){
        int answer = 1;
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                answer++;
                max = arr[i];
            }
        }
        return answer;
    }
}
