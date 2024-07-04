package org.example.SortingSearching;
import java.util.*;
public class Solution3 {
    public int[] solution(int n, int[] arr) {
        for (int i = 1; i < n; i++) {
            int tmp = arr[i];
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > tmp) {
                    arr[j + 1] = arr[j];
                    arr[j] = tmp;
                } else break;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Solution3 s = new Solution3();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        for (int x : s.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
