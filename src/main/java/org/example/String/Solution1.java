package org.example.String;

import java.util.Scanner;

public class Solution1 {
    public int solution(String str, char c) {
        int answer = 0;
        String[] arr = str.split("");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].toUpperCase().equals(c + "") || arr[i].toLowerCase().equals(c + "")) answer++;
        }
        return answer;
    }

    public int correct(String str, char t) {
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
//        System.out.println(str + " " + t);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == t) answer++;
        }
        return answer;
    }

    public int correct2(String str, char t) {
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
        for (char x : str.toCharArray()) {
            if (x == t) answer++;
        }
        return answer;
    }
}
