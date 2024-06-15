package org.example.String;

import java.util.Scanner;

public class Solution2 {
    public String solution(String str) {
        String answer = "";
        //대문자는 65 ~ 90, 소문자는 97 ~ 122 대문자와 소문자는 32 만큼 차이남
        for (char s : str.toCharArray()) {
            if (s - 0 < 91) answer += Character.toLowerCase(s);
            else answer += Character.toUpperCase(s);
        }
        return answer;
    }

    public String correct(String str) {
        String answer = "";
        for (char x : str.toCharArray()) {
            if (Character.isLowerCase(x)) answer += Character.toUpperCase(x);
            else answer += Character.toLowerCase(x);
        }
        return answer;
    }

    //대문자는 65 ~ 90, 소문자는 97 ~ 122 대문자와 소문자는 32 만큼 차이남
    public String correct2(String str) {
        String answer = "";
        for (char x : str.toCharArray()) {
            //대문자
            if (x >= 65 && x <= 90) answer += (char) (x + 32);
            else if (x >= 97 && x <= 122) answer += (char) (x - 32);
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input1 = in.next();
        Solution2 s = new Solution2();
        System.out.println(s.correct2(input1));
    }
}
