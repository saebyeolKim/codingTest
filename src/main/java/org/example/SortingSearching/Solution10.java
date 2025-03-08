package org.example.SortingSearching;

import java.util.*;

public class Solution10 {
    public int count (int[] arr, int dist) {
        int cnt = 1; //말 마리 수
        int ep = arr[0]; //제일 왼쪽 좌표
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - ep >= dist) {
                cnt++;
                ep = arr[i];
            }
        }
        return cnt;
    }

    public int solution(int n, int c, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        int lt = 1, rt = arr[n - 1]; //lt 는 두 말 사이의 최소값, rt 는 최대값
        while (lt <= rt) {
            int mid = (lt + rt) / 2; //가장 가까운 두 말의 최대 거리가 mid 라고 가정
            if (count(arr, mid) >= c) {
                answer = mid;
                lt = mid + 1;
            } else rt = mid - 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution10 s = new Solution10();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(s.solution(n, c, arr));
    }

    public int review1(int n, int c, int[] arr) {
        //n : 마구간의 개수, c : 말 개수, arr : 마구간좌표
        //12-4---89
        int answer = 0;
        Arrays.sort(arr);
        int lt = 1, rt = arr[n - 1];
        while (lt <= rt) {
            int mid = (lt + rt) / 2; //가장 가까운 두 마리의 거리를 5라고 가정하고 배치한다.
            if (count1(arr, mid) >= c) {
                answer = mid;
                lt = mid + 1;
            } else rt = mid - 1;
        }
        return answer;
    }

    public int count1(int[] arr, int dist) {
        int cnt = 1; //말의 개수
        int ep = arr[0]; //바로 전에 말을 배치한 마구간의 좌표
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - ep >= dist) {
                cnt++;
                ep = arr[i];
            }
        }
        return cnt;
    }
}
