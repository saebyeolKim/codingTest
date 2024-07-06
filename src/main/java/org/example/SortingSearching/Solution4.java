package org.example.SortingSearching;
import java.util.*;
public class Solution4 {
    public ArrayList<Integer> solution(int s, int n, int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        for (int i = 1; i < n; i++) {
            if (list.contains(arr[i])) {
                int index = list.indexOf(arr[i]);
                list.remove(index);
                list.add(0, arr[i]);
            } else {
                list.add(0, arr[i]);
                if (list.size() > s) list.remove(s);
            }
        }
        return list;
    }

    public int[] teacher(int s, int n, int[] arr) {
        int[] cache = new int[s];
        for (int x : arr) {
            int pos = -1;
            for (int i = 0; i < s; i++) if (x == cache[i]) pos = i;
            if (pos == -1) {
                for (int i = s - 1; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
            } else {
                for (int i = pos; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
            }
            cache[0] = x;
        }

        return cache;
    }

    public static void main(String[] args) {
        Solution4 T = new Solution4();
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        for (int x : T.teacher(s, n , arr)) {
            System.out.print(x + " ");
        }
    }
}
