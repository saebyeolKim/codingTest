package org.example.SortingSearching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution8 {
    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        for (int i = 0 ; i < n; i++) {
            if (arr[i] == m) return i + 1;
        }
        return answer;
    }

    public int teacher(int n, int m, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        int lt = 0, rt = n - 1;
        while (lt >= rt) {
            int mid = (lt + rt) / 2;
            if (arr[mid] == m) return mid + 1;
            if (arr[mid] > m) rt = mid - 1;
            else lt = mid + 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution8 s = new Solution8();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0 ; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(s.review1(n, m, arr));
    }

    public int review1(int n, int m, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            if (arr[i] == m) return i + 1;
        }
        return answer;
    }
}
