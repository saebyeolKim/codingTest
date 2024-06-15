package org.example.String;

public class Solution1 {
    public int solution(String str, char c) {
        int answer = 0;
        String[] arr = str.split("");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].toUpperCase().equals(c + "") || arr[i].toLowerCase().equals(c + "")) answer++;
        }
        return answer;
    }

    public int correct(String star, char t) {
        int answer = 0;
        return answer;
    }
}
