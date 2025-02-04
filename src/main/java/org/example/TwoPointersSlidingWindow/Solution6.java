package org.example.TwoPointersSlidingWindow;
import java.util.*;
public class Solution6 {
    public int solution(int n, int k, int[] arr) {
        int answer = 0;
        //6 -> 6 -> 8 -> 7
        //k 가 -1 이 됐을 때의 인덱스 값이 1의 개수
        //다음 시작은 두번째 0부터 다시 인덱스 돌기
        int i, first, tmp = k;
        for (i = 0; i < n; i++) {
            while (tmp < 0) {
                if (arr[i] == 0 && tmp == k) first = i;
                if (arr[i] == 0) tmp--;
            }
        }
        return answer;
    }

    public int teacher(int n, int k, int[] arr) {
        int answer = 0, lt = 0, cnt = 0;
        for (int rt = 0; rt < n; rt++) {
            if (arr[rt] == 0) cnt++;
            while (cnt > k) {
                if (arr[lt] == 0) cnt--;
                lt++;
            }
            answer = Math.max(answer, (rt - lt + 1));
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution6 s = new Solution6();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr= new int [n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(s.review1(n, k, arr));
    }

    public int review1(int n, int k , int[] arr) {
        int answer = 0, lt = 0, zero = 0;
        for (int rt = 0; rt < n; rt++) {
            if (arr[rt] == 0) zero++;
            answer = Math.max(answer, rt - lt);
            while (zero > k) {
                if (arr[lt++] == 0) zero--;
            }
        }
        return answer;
    }
}
