package org.example.String;
import java.util.*;
public class Solution10 {
    public Integer[] solution(String s, char c) {
        Integer[] answer = new Integer[s.length()];
        int p = 1000;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != c) p++;
            else p = 0;
            answer[i] = p;
        }
        p = 1000;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != c) p++;
            else p = 0;
            if (answer[i] > p) {
                answer[i] = p;
            }
        }
        return answer;
    }

    public int[] teacher(String s, char t) {
        int[] answer = new int[s.length()];
        int p = 1000;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t) {
                p = 0;
                answer[i] = p;
            } else {
                p++;
                answer[i] = p;
            }
        }
        p = 1000;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == t) p = 0;
            else {
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution10 s = new Solution10();
        Scanner in = new Scanner(System.in);
        String input1 = in.next();
        char input2 = in.next().charAt(0);
        for (int x : s.review1(input1, input2)) {
            System.out.print(x + " ");
        }
    }

    public int[] review1(String str, char c) {
        int[] answer = new int[str.length()];
        char[] arr = str.toCharArray();
        int index = 1000; //큰 수를 설정해줘야 앞, 뒤 인덱스에서 오류가 안남
        for (int i = 0; i < str.length(); i++) {
            if (arr[i] != c) index++;
            else index = 0;
            answer[i] = index;
        }
        index = 1000;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (arr[i] == c) index = 0;
            else {
                index++;
                answer[i] = Math.min(answer[i], index);
            }
        }

        return answer;
    }
}
