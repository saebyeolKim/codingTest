package org.example.Array;
import java.util.*;
public class Solution1 {
    public String solution(int[] arr) {
        String answer = "";
        int tmp = 0;
        for (int n : arr) {
            if (n > tmp) answer += n + " ";
            tmp = n;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(s.solution(arr));
    }

    public ArrayList<Integer> teacher(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) answer.add(arr[i]);
        }
        return answer;
    }
}
