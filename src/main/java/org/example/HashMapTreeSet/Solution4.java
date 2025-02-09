package org.example.HashMapTreeSet;
import java.util.*;
public class Solution4 {
    public int solution(String s, String t) {
        int answer = 0;
        Map<Character, Integer> bmap = new HashMap<>();
        Map<Character, Integer> amap = new HashMap<>();
        for (char x : t.toCharArray()) bmap.put(x, bmap.getOrDefault(x, 0) + 1);
        int L = t.length() - 1;
        for (int i = 0; i < L; i++) amap.put(s.charAt(i), amap.getOrDefault(s.charAt(i), 0) + 1);
        int lt = 0;
        for (int rt = L; rt < s.length(); rt++) {
            amap.put(s.charAt(rt), amap.getOrDefault(s.charAt(rt), 0) + 1);
            if (amap.equals(bmap)) answer++;
            amap.put(s.charAt(lt), amap.get(s.charAt(lt)) - 1);
            if(amap.get(s.charAt(lt)) == 0) amap.remove(s.charAt(lt));
            lt++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution4 main = new Solution4();
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        System.out.println(main.review1(s, t));
    }

    public int review1(String s, String t) {
        int answer = 0;
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        int tLen = t.length();
        for (int i = 0; i < tLen; i++) map1.put(t.charAt(i), map1.getOrDefault(t.charAt(i), 0) + 1);
        for (int i = 0; i < tLen - 1; i++) map2.put(s.charAt(i), map2.getOrDefault(s.charAt(i), 0) + 1);
        int lt = 0;
        for (int rt = tLen - 1; rt < s.length(); rt++) {
            map2.put(s.charAt(rt), map2.getOrDefault(s.charAt(rt), 0) + 1);
            if (map1.equals(map2)) answer++;
            map2.put(s.charAt(lt), map2.get(s.charAt(lt)) - 1);
            if (map2.get(s.charAt(lt)) == 0) map2.remove(s.charAt(lt));
            lt++;
        }
        return answer;
    }
}
