package org.example.String;

import java.util.Scanner;
import java.util.*;

public class Solution6 {
    public String solution(String str) {
        String answer = "";
        for (char x : str.toCharArray()) {
            if (answer.indexOf(x) == -1) answer += x;
        }
        return answer;
    }

    public String correct(String str) {
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
//            System.out.println(str.charAt(i) + " " + i + " " + str.indexOf(str.charAt(i)));
            if (str.indexOf(str.charAt(i)) == i) answer += str.charAt(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution6 s = new Solution6();
        Scanner in = new Scanner(System.in);
        String input = in.next();
        System.out.println(s.review1(input));
    }

    public String review1(String s) {
        char[] arr = s.toCharArray();
        String answer = String.valueOf(arr[0]);
        for (char c : arr) {
            if (!answer.contains(String.valueOf(c))) answer += String.valueOf(c);
        }
        return answer;
    }
}
