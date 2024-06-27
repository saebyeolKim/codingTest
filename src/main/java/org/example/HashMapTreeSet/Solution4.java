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
        System.out.println(main.solution(s, t));
    }
}
