package org.example.TwoPointersSlidingWindow;
import java.util.*;
public class Solution1 {
    public int[] solution(int n, int[] arr1, int m, int[] arr2) {
        int[] answer = new int[n + m];
        int index = 0;
        for (int i : arr1) {
            answer[index++] = i;
        }
        for (int j : arr2) {
            answer[index++] = j;
        }
        Arrays.sort(answer);
        return answer;
    }

    public ArrayList<Integer> teacher(int n, int[] arr1, int m, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;
        while (p1 < n && p2 < m) {
            if (arr1[p1] < arr2[p2]) answer.add(arr1[p1++]);
            else answer.add(arr2[p2++]);
        }
        while (p1 < n) answer.add(arr1[p1++]);
        while (p2 < m) answer.add(arr2[p2++]);
        return answer;
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = in.nextInt();
        }
        for (int x : s.teacher(n, arr1, m, arr2)) {
            System.out.print(x + " ");
        }
    }
}
