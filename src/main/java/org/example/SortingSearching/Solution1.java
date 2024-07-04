package org.example.SortingSearching;
import java.util.*;
public class Solution1 {
    public int[] solution(int n, int[] arr) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i; j < n;  j++) {
                if(arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }

    /**
     * 선택정렬
     * j 가 i 뒷 편부터 돈다.
     * 첫번째 돌 때 가장 작은 값이 앞에 온다.
     * 두번째 돌 때 두번째로 작은 값이 앞에 온다.
     */
    public int[] teacher(int n, int[] arr) {
        for (int i = 0; i < n - 1; i++) {
            int idx = i;
            for (int j = i + 1; j < n;  j++) {
                if(arr[j] < arr[idx]) idx = j;
            }
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }
        return arr;
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        for (int x : s.teacher(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
