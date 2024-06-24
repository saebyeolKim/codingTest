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
        for (int x : s.teacher(n, a, m, b)) {
            System.out.print(x + " ");
        }
    }
}
