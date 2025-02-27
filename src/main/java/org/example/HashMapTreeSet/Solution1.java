package org.example.HashMapTreeSet;
import java.util.*;
public class Solution1 {
    public char solution(int n, String str) {
        char answer = ' ';
        Map<Character, Integer> map = new HashMap<>();
        for(char x : str.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        System.out.println(map.containsKey('A')); //true or false
        System.out.println(map.size()); //key 의 개수
        System.out.println(map.remove('A')); //A key 삭제
        int max = 0;
        for (char key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                answer = key;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str = in.next();
        System.out.println(s.review1(n, str));
    }

    public String review1(int n, String str) {
       String answer = "";
       Map<Character, Integer> map = new HashMap<>();
       for (char c : str.toCharArray()) map.put(c, map.getOrDefault(c, 0) + 1);
       int max = 0;
       for (char h : map.keySet()) {
           if (max < map.get(h)) {
               max = map.get(h);
               answer = h + "";
           }
       }
       return answer;
    }
}
