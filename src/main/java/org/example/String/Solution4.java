package org.example.String;

import java.util.Scanner;
import java.util.*;
public class Solution4 {

    public String solution(int n, String str) {
        String answer = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            answer += str.charAt(i);
        }
        return answer;
    }

    public ArrayList<String> correct(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for (String x : str) {
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }
        return answer;
    }

    public ArrayList<String> correct2(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for (String x : str) {
            char[] s = x.toCharArray();
            int lt = 0;
            int rt = x.length() - 1;
            while (lt < rt) {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }
        return answer;
    }

    public static void myMain(String[] args) {
        Solution4 s = new Solution4();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str = "";
        while (n > 0) {
            str = in.next();
            System.out.println(s.solution(n, str));
            n--;
        }
    }

    public static void main(String[] args) {
        Solution4 s = new Solution4();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = in.next();
        }
        for (String x : s.correct2(n, str)) {
            System.out.println(x);
        }
    }
}
