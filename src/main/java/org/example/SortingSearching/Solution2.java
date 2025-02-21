package org.example.SortingSearching;
import java.util.*;
public class Solution2 {
    /**
     * 버블정렬
     * 인접한 두 개의 원소끼리 값을 비교하여
     * 오름차순이면 앞에 것을 작게, 뒤에 것을 크게 한다.
     */
    public int[] solution(int n, int[] arr) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
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

    //1 2 3 4 5
    //arr[0] arr[1]
    //arr[1] arr[2]
    //arr[2] arr[3]
    //arr[3] arr[4]
    public int[] review1(int n, int[] arr) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return arr;
    }
}
