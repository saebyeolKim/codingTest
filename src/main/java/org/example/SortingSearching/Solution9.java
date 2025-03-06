package org.example.SortingSearching;

import java.util.*;

public class Solution9 {

    public int count(int[] arr, int capacity) {
        int cnt = 1, sum = 0;
        for (int x : arr) {
            if (sum + x > capacity) {
                cnt++;
                sum = x;
            } else sum += x;
        }
        return cnt;
    }
    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (count(arr, mid) <= m) {
                answer = mid;
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution9 s = new Solution9();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(s.review1(n, m, arr));
    }

    public int review1(int n, int m, int[] arr) {
        //결정알고리즘
        //순서를 유지하면서, 3장에 담아낼 수 있는 1장의 최소 용량
        //lt -------------------- rt
        //lt 부터 rt 사이의 확실히 답이 있을 때만 결정알고리즘을 사용해야 함
        //절반을 잘라서 절반을 자른 값이 이 문제의 답으로 가능한 숫자가 될 수 있는가?
        //arr 의 모든 숫자를 더해서 최소값(lt), 최대값(rt)으로 풀어서 절반을 나눠, 점차 줄이거나 늘려야 함
        //lt = 9, rt = 45
        int answer = 0;
        Arrays.sort(arr);
        int lt = arr[arr.length - 1];
        int rt = 0;
        for (int a : arr) rt += a;
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (countDVDs(arr, mid) <= m) { //DVD 개수가 M 이하라면 가능
                answer = mid;
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }
        return answer;
    }

    public int countDVDs(int[] arr, int capacity) {
        int count = 1; //최소 DVD 가 한장은 필요하기 때문
        int sum = 0;
        for (int a : arr) {
            if (sum + a > capacity) { //정해진 용량을 초과하면
                count++; //DVD 한장 더 필요
                sum = a;
            } else sum += a;
        }
        return count;
    }
}
