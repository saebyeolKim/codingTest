package org.example.SortingSearching;
import java.util.*;
public class Solution5 {
    public String solution(int n, int[] arr) {
        String answer = "U";
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (list.contains(arr[i])) return "D";
            else list.add(arr[i]);
        }
        return answer;
    }

    public String teacher(int n, int[] arr) {
        String answer = "U";
        Arrays.sort(arr);
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) return "D";
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution5 s = new Solution5();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(s.solution(n, arr));
    }
}
