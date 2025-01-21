package org.example.Array;
import java.util.*;
public class Solution6 {

    public String solution(int n, int[] arr) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            StringBuilder sd = new StringBuilder(String.valueOf(arr[i])).reverse();
            int num = Integer.parseInt(String.valueOf(sd));
            for (int j = 2; j <= num; j++) {
                if (num % j == 0) {
                    if (num == j) answer += num + " ";
                    break;
                }
            }
        }
        return answer;
    }



    public static void main(String[] args) {
        Solution6 s = new Solution6();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(s.solution(n, arr));
    }

    public String review1(int n, int[] arr) {
        String answer = "";
        for (int a : arr) {
            StringBuilder sb = new StringBuilder(a + "").reverse();
            int tmp = Integer.parseInt(sb.toString());
            int num = 0;
            for (int i = 2; i < tmp / 2; i++) {
                if (tmp % i == 0) {
                    num++;
                    break;
                }
            }
            if (tmp != 1 && num == 0) answer += tmp + " ";
        }
        return answer;
    }

    public boolean isPrime(int num) {
        if (num == 1) return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public ArrayList<Integer> teacher(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int tmp = arr[i];
            int res = 0;
            while (tmp > 0) {
                int t = tmp % 10;
                res = res * 10 + t;
                tmp /= 10;
            }
            if (isPrime(res)) answer.add(res);
        }
        return answer;
    }

    public static void teacherMain(String[] args) {
        Solution6 s = new Solution6();
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
