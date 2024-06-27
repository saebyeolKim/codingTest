package org.example.HashMapTreeSet;
import java.util.*;
public class Solution3 {
    //Runtime Error
    public int[] solution(int n, int k, int[] arr) {
        int[] answer = new int[k];
        int lt = 0, rt = 0, index = 0;
        Map<Integer, Integer> map = new HashMap<>();
        while (rt <= n) {
            if (rt == k) {
                answer[index++] = map.size();
                lt++;
                k = lt + k;
                rt = lt; //3
                map.clear();
            }
            if (rt == n) {
                answer[index++] = map.size();
                break;
            }
            map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
            rt++;
        }
        return answer;
    }

    public ArrayList<Integer> teacher(int n, int k, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        Map<Integer, Integer> HM = new HashMap<>();
        for (int i = 0; i < k - 1; i++) {
            HM.put(arr[i], HM.getOrDefault(arr[i], 0) + 1);
        }
        int lt = 0;
        for (int rt = k - 1; rt < n; rt++) {
            HM.put(arr[rt], HM.getOrDefault(arr[rt], 0) + 1);
            answer.add(HM.size());
            HM.put(arr[lt], HM.get(arr[lt]) - 1);
            if (HM.get(arr[lt]) == 0) HM.remove(arr[lt]);
            lt++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution3 s = new Solution3();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        for (int x : s.teacher(n, k, arr)) {
            System.out.print(x + " ");
        }
    }
}
