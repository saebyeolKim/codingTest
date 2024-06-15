package org.example.String;

import java.util.Scanner;

public class Solution5 {

    //오답인데 왜 오답인지 모르겠음
    public String solution(String str) {
        char[] c = str.toCharArray();
        int n = c.length - 1;
        for (int i = 0; i < c.length/2; i++) {
            if (((c[i] >= 97 && c[i] <= 122) || (c[i] >= 65 && c[i] <= 90)) && ((c[n] >= 97 && c[n] <= 122) || (c[n] >= 65 && c[n] <= 90))) {
                System.out.println(c[i] + " " + c[n]);
                char tmp = c[i];
                int rt = str.length() - i - 1;
                c[i] = c[rt];
                c[rt] = tmp;
            }
            n--;
        }
        return String.valueOf(c);
    }

    public String solution2(String str) {
        char[] c = str.toCharArray();
        int lt = 0;
        int rt = c.length - 1;
        while(lt < rt) {
            if ((c[lt] < 97 && c[lt] > 122) || (c[lt] < 65 && c[lt] > 90)) {
                lt++;
            } else if ((c[rt] < 97 && c[rt] > 122) || (c[rt] < 65 && c[rt] > 90)) {
                rt--;
            } else {
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt++;
                rt--;
            }
        }
        return String.valueOf(c);
    }

    public String correct(String str) {
        char[] s = str.toCharArray();
        int lt = 0, rt = str.length() - 1;
        while (lt < rt) {
            if (!Character.isAlphabetic(s[lt])) lt++;
            else if (!Character.isAlphabetic(s[rt])) rt--;
            else {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        return String.valueOf(s);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.next();
        Solution5 s = new Solution5();
        System.out.println(s.solution2(input1));
    }
}
