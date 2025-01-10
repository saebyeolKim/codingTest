package org.example.String;
import java.util.*;
public class Solution12 {
    public String solution(int n, String str) {
        char[] answer = new char[n];
        str = str.replace("#", "1");
        str = str.replace("*", "0");
        for (int i = 0; i < n; i++) {
            answer[i] = getTwo(str.substring(i * 7, (i + 1) * 7));
        }
        return Arrays.toString(answer);
    }

    private char getTwo(String data) {
        double tmp = 0.0;
        for (int i = 0; i < 7; i++) {
            if (data.charAt(i) == '1') tmp += Math.pow(2, (6 - i));
        }
        return (char) tmp;
    }

    public static void main(String[] args) {
        Solution12 s = new Solution12();
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        String input2 = in.next();
        System.out.print(s.review1(input1, input2));
    }

    public String teacher(int n, String s) {
        String answer = "";
        for (int i = 0 ; i < n; i++) {
            String tmp = s.substring(0, 7).replace("#", "1").replace("*", "0");
            int num = Integer.parseInt(tmp, 2); //2진수를 10진수로
            answer += (char) num;
            s = s.substring(7);
        }
        return answer;
    }

    public String review1(int n, String str) {
        str = str.replace("#", "1").replace("*", "0");
        String answer = "" + (char)Integer.parseInt(str.substring(0, 7), 2);
        for (int i = 7; i < str.length(); i++) {
            if (i % 7 == 0) {
                answer += "" + (char)Integer.parseInt(str.substring(i, i + 7), 2);
            }
        }
        return answer;
    }

}
