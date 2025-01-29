package org.example.TwoPointersSlidingWindow;
import java.util.*;
public class Solution2 {
    //runtime error
    public ArrayList<Integer> solution(int n, int[]a, int m, int[]b) {
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i] == b[j]) answer.add(a[i]);
            }
        }
        return answer;
    }

    public ArrayList<Integer> teacher(int n, int[]a, int m, int[]b) {
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);
        int p1 = 0, p2 = 0;
        //p1 과 p2 의 값을 비교해서 작은 값의 p를 증가시킨다.
        while (p1 < n && p2 < m) {
            if (a[p1] < b[p2]) p1++;
            else if (a[p1] > b[p2]) p2++;
            else {
                answer.add(a[p1]);
                p1++;
                p2++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = in.nextInt();
        }
        for (int x : s.review1(n, a, m, b)) {
            System.out.print(x + " ");
        }
    }

    public ArrayList<Integer> review1(int n, int[] arr1, int m, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        // 1 2 3 5 9
        // 2 3 5 7 8
        int p1 = 0, p2 = 0;
        while(p1 < n && p2 < m) {
            if (arr1[p1] < arr2[p2]) p1++;
            else if (arr1[p1] > arr2[p2]) p2++;
            else if (arr1[p1] == arr2[p2]) {
                answer.add(arr1[p1]);
                p1++;
                p2++;
            }
        }
        return answer;
    }
}
