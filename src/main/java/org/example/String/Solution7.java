package org.example.String;

import java.util.Scanner;

public class Solution7 {

    public String solution(String str) {
        String answer = "YES";
        char[] c = str.toLowerCase().toCharArray();
        int lt = 0;
        int rt = str.length() - 1;
        while(lt < rt) {
            if (c[lt] != c[rt]) return "NO";
            else {
                lt++;
                rt--;
            }
        }
        return answer;
    }

    public String teacher(String str) {
        String answer = "YES";
        str = str.toLowerCase();
        int len = str.length();
        for (int i = 0; i < len/2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) return "NO";
        }
        return answer;
    }

    public String teacher2(String str) {
        String answer = "YES";
        String tmp = new StringBuilder(str).reverse().toString();
        //equalsIgnoreCase 대소문자 구분안함
        if (!str.equalsIgnoreCase(tmp)) return "NO";
        return answer;
    }

    public static void main(String[] args) {
        Solution7 s = new Solution7();
        Scanner in = new Scanner(System.in);
        String input = in.next();
        System.out.println(s.review1(input));
    }

    public String review1(String str) {
        str = str.toLowerCase();
        char[] arr = str.toCharArray();
        int lt = 0;
        int rt = str.length() - 1;
        while (lt < rt) {
            if (arr[lt] == arr[rt]) {
                lt++;
                rt--;
            } else {
                return "NO";
            }
        }
        return "YES";
    }
}
