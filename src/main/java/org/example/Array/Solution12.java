package org.example.Array;
import java.util.*;
public class Solution12 {
    public int solution(int n, int m, int[][]arr) {
        int answer = 0;
        //n:학생수(4), m:수학테스트 차수(3),
        for (int i = 0; i < n; i++) {
            int myRank = i;
            int mt = n - i - 1;
            for (int j = 0; j < m; j++) {
                //타겟 arr[0][2]
                //arr[0,0] arr[0,1] arr[0,2] arr[0,3]
                //arr[1,0] arr[1,1] arr[1,2] arr[1,3]
                //arr[2,0] arr[2,1] arr[2,2] arr[2,3]
                //첫번째 돌았을 때 1등해서 3명을 가르칠 수 있음 (돌면서 몇명 가르칠 수 있는지 확인)
                //두번째 돌았을 때 2등해서 2명을 가르칠 수 있음 (이전 등수 보다 낮으면 --)
                //마지막 돌았을 때 1등해서 2명을 가르칠 수 있음 (이전 등수 보다 높으면 break;)
                for (int k = 0; k < n; k++) {
                    if (myRank < k && arr[j][i] == arr[j][k]) {
                        mt--;
                        myRank = k;
                    }
                    if (myRank > k) break;
                }
                System.out.println("arr[j][i] = " + arr[j][i] + " mt = " + mt);
            }
        }
        return answer;
    }

    public int teacher (int n, int m, int[][]arr) {
        int answer = 0;
        //i와 j가 멘토 멘티가 될 수 있는가
        //1번은 1,2,3,4 와 멘토멘티 => 멘토멘티가 될 수 있는 경우의 수 = n * n
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int cnt = 0;
                for (int k = 0; k < m; k++) {
                    int pi = 0, pj = 0;
                    for (int s = 0; s < n; s++) {
                        if (arr[k][s] == i) pi = s;
                        if (arr[k][s] == j) pj = s;
                    }
                    if (pi < pj) cnt++;
                }
                if (cnt == m) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution12 s = new Solution12();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(s.review1(n, m, arr));
    }

    public int review1(int n, int m, int[][] arr) {
        int answer = 0;
        //0등이 제일 높을 걸로 가정.
        //4명의 학생으로 멘토멘티 가질 수 있는 총 경우의 수 = 멘토 * 멘티 = 16 (물론 멘티와 멘토가 같을 경우는 제외해야되지만 지금은 안제외한 경우)
        //1번 학생이 2, 3, 4 번 학생보다 모든 테스트에서 앞서는 지 모든 경우의 수를 확인해 봐야 함.
        //모든 경우의 수를 계산 하기 위해 i, j 를 n 까지 돌린다.
        //짝궁은 (i, j)로 지어놓고, k 테스트에서 s 돌면서 등수를 구한다.
        //(i(3), j(1)) 0번째 테스트에서 arr[k][s] == i (k 테스트에서 s 등수가 i와 같다면 == 자기자신의 등수 구하기
        //pi (i 의 포지션)은 s 이다.
        //(i(3), j(1)) 0번째 테스트에서 arr[k][s] == j (k 테스트에서 s 등수가 j와 같다면 == 자기자신의 등수 구하기
        //pj (j 의 포지션)은 s 이다.
        //pi < pj 라면 cnt++ (등수가 높으니 멘티로 가르칠 수 있다.)
        //cnt 가 m 과 똑같다면(모든 테스트에서 pi가 앞선 것이기 때문에) 너희 짝궁은 멘토멘티가 될 수 있다고 판단.
        //answer++
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n; j++) {
                int cnt = 0;
                for (int k = 0; k < m; k++) {
                    int pi = 0, pj = 0;
                    for (int s = 0; s < n; s++) {
                        if (arr[k][s] == i) pi = s;
                        if (arr[k][s] == j) pj = s;
                    }
                    if (pi < pj) cnt++;
                }
                if (cnt == m) answer++;
            }
        }
        return answer;
    }
}
