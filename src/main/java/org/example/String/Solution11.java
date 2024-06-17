package org.example.String;
import java.util.*;
public class Solution11 {
    public String solution(String str) {
        String answer = "";
        str += " ";
        int n =  1;
        char c = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == c) n++;
            else {
                answer += (n == 1) ? c + "" : (c + "") + n;
                n = 1;
            }
            c = str.charAt(i);
        }
        return answer;
    }

    public String teacher(String s) {
        String answer = "";
        s += " ";
        int cnt = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) cnt++;
            else {
                answer += s.charAt(i);
                if (cnt > 1) answer += cnt;
                cnt = 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution11 s = new Solution11();
        Scanner in = new Scanner(System.in);
        String input = in.next();
        System.out.println(s.teacher(input));
    }
}
