package org.example.String;
import java.util.Scanner;

public class Solution8 {

    //오답인데 반례가 무엇인지 모르겠음
    public String solution(String str) {
        String answer = "YES";
        str = str.toLowerCase();
        int len = str.length();
        for (int i = 0; i < len/2; i++) {
            if (Character.isAlphabetic(str.charAt(i)) && Character.isAlphabetic(str.charAt(len - i - 1))) {
                if (str.charAt(i) != str.charAt(len - i - 1)) return "NO";
            }
        }
        return answer;
    }

    public String teacher(String str) {
        String answer = "NO";
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(str).reverse().toString();
        if (tmp.equals(str)) answer = "YES";
        return answer;
    }

    public static void main(String[] args) {
        Solution8 s = new Solution8();
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        System.out.println(s.solution(input));
    }
}
