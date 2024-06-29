package org.example.HashMapTreeSet;
import java.util.*;
public class Solution5 {
    public int solution(int n, int k, int[] arr) {
        int answer = 0;
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder()); //내림차순(큰 수가 앞에 오도록)
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int l = j + 1; l < n; l++) {
                    Tset.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }
        if (Tset.size() < k) return -1;
        int cnt = 0;
        for (int x : Tset) {
            cnt++;
            if (cnt == k) return x;
        }
        //Tset.remove(143);
        //Tset.size();
        //Tset.first(); //오름차순이면 최소값, 내림차순으로 하면 최대값, 제일 앞의 값
        //Tset.last(); //오름차순이면 최대값, 내림차순으로 하면 최소값, 제일 뒤의 값
        return answer;
    }

    public static void main(String[] args) {
        Solution5 s = new Solution5();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(s.solution(n, k , arr));
    }
}
