package org.example.Array;
import java.util.*;
public class Solution10 {
    public int solution(int n, int[][] arr) {
        int answer = 0;
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (arr[i][j] > arr[i][j - 1] && arr[i][j] > arr[i - 1][j] && arr[i][j] > arr[i + 1][j] && arr[i][j] > arr[i][j + 1]) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution10 s = new Solution10();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n + 2][n + 2];
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(s.review1(n, arr));
    }

    public int review1(int n, int[][] arr) {
        int answer = 0;
        for (int i = 1; i < n + 1; i++) {
            for(int j = 1; j < n + 1; j++) {
                int a = arr[i][j]; //(2,1)
                //상
                int up = arr[i][j - 1]; //(2,0)
                //하
                int down = arr[i][j + 1]; //(2,2)
                //좌
                int left = arr[i - 1][j]; //(1,1)
                //우
                int right = arr[i + 1][j]; //(3,1)
                if (a > up && a > down && a > left && a > right) answer++;
            }
        }
        return answer;
    }

    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};
    public int teacher(int n, int[][] arr) {
        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean flag = true;
                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if (nx >= 0 && nx < n && ny >= 0 && ny < n && arr[nx][ny] >= arr[i][j]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) answer++;
            }
        }
        return answer;
    }

    public static void teacherMain(String[] args) {
        Solution10 s = new Solution10();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(s.solution(n, arr));
    }

}
