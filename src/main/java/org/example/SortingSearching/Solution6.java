package org.example.SortingSearching;
import java.util.*;
public class Solution6 {
    public String solution(int n, int[] arr) {
        int[] answer = new int[2];
        int[] tmp = new int[n];
        for (int j = 0 ; j < n; j++) tmp[j] = arr[j];
        Arrays.sort(tmp);
        for (int i = 0; i < n; i++) {
            if (arr[i] != tmp[i]) {
                if (answer[0] == 0) answer[0] = i + 1;
                else answer[1] = i + 1;
            }
        }
        return answer[0] + " " + answer[1];
    }

    public String teacher(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] tmp = arr.clone(); //깊은 복사
        Arrays.sort(tmp);
        for (int i = 0; i < n; i++) {
            if (arr[i] != tmp[i]) answer.add(i + 1);
        }

        return answer.get(0) + " " + answer.get(1);
    }

    public static void main(String[] args) {
        Solution6 s = new Solution6();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(s.review1(n, arr));
    }

    public String review1(int n, int[] arr) {
        String answer = "";
        int[] tmp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) tmp[i] = arr[i];
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (tmp[i] != arr[i]) answer += (i + 1) + " ";
        }
        return answer;
    }
}
