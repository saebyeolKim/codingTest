package org.example.StackQueue;
import java.util.*;
public class Solution5 {
    public int solution(String str) {
        int answer = 0;
        Stack<Character> st = new Stack<>();
        st.push(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == '(') st.push(str.charAt(i));
            else {
                //레이저라면 pop 한 뒤에 개수 세서 answer 에 넣어주기
                if (str.charAt(i - 1) == '(') {
                    st.pop();
                    answer += st.size();
                } else { //레이저가 아니라면 pop 한 뒤에 answer +1
                    st.pop();
                    answer += 1;
                }
            }

        }
        return answer;
    }

    public int teacher(String str) {
        int answer = 0;
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') st.push('(');
            else {
               st.pop();
               if (str.charAt(i - 1 ) == '(') answer += st.size();
               else answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution5 s = new Solution5();
        Scanner in = new Scanner(System.in);
        String input = in.next();
        System.out.println(s.solution(input));
    }
}
