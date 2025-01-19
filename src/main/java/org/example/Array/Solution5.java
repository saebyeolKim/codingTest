package org.example.Array;
import java.util.*;
public class Solution5 {
    //타임아웃
    public int solution(int n) {
        int answer = 1;
        if (n == 2) return 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 3; j <= i; j++) {
                if (i == j) answer++;
                if (i % (j - 1) == 0) break;
            }
        }
        return answer;
    }

    //배열을 초기화 한 후, 배열의 값이 0이면 그 배열의 값을 1로 바꾸고 그 배열 값의 배수들을 다 1로 바꾼다.
    public int teacher(int n) {
        int answer = 0;
        int[] arr = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            if (arr[i] == 0) {
                answer++;
                for (int j = i; j <= n; j = j + i) arr[j] = 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution5 s = new Solution5();
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        System.out.println(s.review1(input));
    }

    public int review1(int n) {
        int answer = 0;
        // 14, 1 2 7 14 약수로 바꿔서 list 안에 값이 1이면 answer++
        //타임아웃 다시 보기
        while(n > 0) {
            List<Integer> list = new ArrayList<>();
            for (int i = 1; i <= n / 2; i++) {
                if (n % i == 0) list.add(i);
            }
            if (list.size() == 1) answer++;
            n--;
        }
        return answer;
    }
}
