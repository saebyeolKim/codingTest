package org.example.HashMapTreeSet;
import java.util.*;
public class Solution2 {
    /**
     * 반례
     * ABCDqtqtqEFqGHIJKLMNOPQRSTUVWetagdgXYabcdefghijklmnopqrstuwxyz
     * aBcdewrqwtqFghIJklMnOpqrsTuegagaeVxyYAbCDEfGHijKLmNoPQRStUwWXz
     */
    public String solution(String a, String b) {
        String answer = "";
        HashMap<Character, Integer> aMap = new HashMap<>();
        HashMap<Character, Integer> bMap = new HashMap<>();
        for (char x : a.toCharArray()) {
            aMap.put(x, aMap.getOrDefault(x, 0) + 1);
        }
        for (char x : b.toCharArray()) {
            bMap.put(x, bMap.getOrDefault(x, 0) + 1);
        }
        for (char x : bMap.keySet()) {
            if (!aMap.containsKey(x)) return "NO";
        }
        for (char x : aMap.keySet()) {
            if (!bMap.containsKey(x)) return "NO";
            else {
                if (aMap.get(x) == bMap.get(x)) answer = "YES";
                else answer = "NO";
            }
        }
        return answer;
    }

    public String solution2(String a, String b) {
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : a.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for (char x : b.toCharArray()) {
            if (map.containsKey(x)) {
                map.put(x, map.get(x) - 1);
            } else return "NO";
        }
        for (char x : map.keySet()) {
            if (map.get(x) != 0) return "NO";
        }
        return answer;
    }

    public String teacher(String a, String b) {
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : a.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for (char x : b.toCharArray()) {
            if (!map.containsKey(x) || map.get(x) == 0) return "NO";
            else map.put(x, map.get(x) - 1);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        Scanner in = new Scanner(System.in);
        String input1 = in.next();
        String input2 = in.next();
        System.out.println(s.review1(input1, input2));
    }

    public String review1(String s1, String s2) {
        String answer = "YES";
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for (char c1 : s1.toCharArray()) map1.put(c1, map1.getOrDefault(c1, 0) + 1);
        for (char c2 : s2.toCharArray()) map2.put(c2, map2.getOrDefault(c2, 0) + 1);
        for (char c : map1.keySet()) {
            if( map1.get(c) != map2.get(c)) answer = "NO";
        }
        return answer;
    }
}
