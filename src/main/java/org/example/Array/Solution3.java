package org.example.Array;
import java.util.*;
public class Solution3 {

    public char[] solution(int n, int[] a, int[] b) {
        char[] answer = new char[n];
        for (int i = 0; i < n; i++) {
          if (a[i] == b[i]) answer[i] = 'D';
          else {
              switch(a[i]) {
                  case 1:
                      if (b[i] == 2) answer[i] = 'B';
                      else if (b[i] == 3) answer[i] = 'A';
                      break;
                  case 2:
                      if (b[i] == 1) answer[i] = 'A';
                      else if (b[i] == 3) answer[i] = 'B';
                      break;
                  case 3:
                      if (b[i] == 1) answer[i] = 'B';
                      else if (b[i] == 2) answer[i] = 'A';
                      break;
              }
          }
        }
        return answer;
    }

    public static void main1(String[] args) {
        Solution3 s = new Solution3();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = in.nextInt();
        }
        for (char x : s.solution(n, a, b)) {
            System.out.println(x);
        }
    }

    public String teacher(int n, int[] a, int[] b) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            if (a[i] == b[i]) answer += "D";
            else if (a[i] == 1 && b[i] == 3) answer += "A";
            else if (a[i] == 2 && b[i] == 1) answer += "A";
            else if (a[i] == 3 && b[i] == 2) answer += "A";
            else answer += "B";
        }
        return answer;
    }

    public static void teacherMain(String[] args) {
        Solution3 s = new Solution3();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = in.nextInt();
        }
        for (char x : s.teacher(n, a, b).toCharArray()) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        Solution3 s = new Solution3();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = in.nextInt();
        }
        for (char x : s.review1(n, a, b)) {
            System.out.println(x);
        }
    }

    public char[] review1(int n, int[] a, int[] b) {
        char[] answer = new char[n];
        for (int i = 0; i < n; i++) {
            if ((a[i] == 1 && b[i] == 2) || (a[i] == 2 && b[i] == 3) || (a[i] == 3 && b[i] == 1)) answer[i] = 'B';
            else if (a[i] == b[i]) answer[i] = 'D';
            else answer[i] = 'A';
        }
        return answer;
    }
}
