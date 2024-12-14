package org.example.String;

import java.util.*;

public class Solution3 {

    public String solution(String str) {
        String answer = "";
        String[] arr = str.split(" ");
        int n = 0;
        for (String a : arr) {
            if (a.length() > n) {
                answer = a;
                n = a.length();
            }
        }
        return answer;
    }

    public String correct(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE;
        String[] s = str.split(" ");
        for (String x : s) {
            int len = x.length();
            if (len > m) {
                m = len;
                answer = x;
            }
        }
        return answer;
    }

    public String correct2(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE, pos;
        while ((pos = str.indexOf(" ")) != -1) {
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if (len > m) {
                m = len;
                answer = tmp;
            }
            str = str.substring(pos + 1);
        }
        if (str.length() > m) answer = str;
        return answer;
    }

    public static void main1(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();
        Solution3 s = new Solution3();
        System.out.println(s.correct(input1));
    }

    //2024-12-14
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String[] sentence = in.nextLine().split(" ");
        int n = 0;
        String answer = "";
        for (String s : sentence) {
            if (s.length() > n) {
                answer = s;
                n = s.length();
            }
        }
        System.out.println(answer);
        return ;
    }
}
