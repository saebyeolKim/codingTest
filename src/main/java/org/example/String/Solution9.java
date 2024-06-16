package org.example.String;
import java.util.*;

public class Solution9 {
    public int solution(String str) {
        str = str.toLowerCase().replaceAll("[a-z]", "");
        return Integer.parseInt(str);
    }

    public int solution2(String str) {
        String answer = "";
        for (char x : str.toCharArray()) {
            if (!Character.isAlphabetic(x)) answer += x;
        }
        return Integer.parseInt(answer);
    }

    public int teacher(String s) {
        int answer = 0;
        //아스키번호 '0' = 48, '9' = 57
        for (char x : s.toCharArray()) {
            if (x >= 48 && x <= 57) answer = answer * 10 + (x - 48);
        }
        return answer;
    }

    public int teacher2(String s) {
        String answer = "";
        for (char x : s.toCharArray()) {
            if (Character.isDigit(x)) answer += x;
        }
        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        Solution9 s = new Solution9();
        Scanner in = new Scanner(System.in);
        String input = in.next();
        System.out.println(s.solution2(input));
    }
}
