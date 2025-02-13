package org.example.StackQueue;
import java.util.*;
public class Solution3 {
    public int solution(int n, int[][]board, int m, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0 ; j < n; j++) {
                int t = board[j][moves[i] - 1];
                if (t != 0) {
                    board[j][moves[i] - 1] = 0;
                    if (!stack.isEmpty() && stack.peek() == t) {
                        stack.pop();
                        answer += 2;
                    } else stack.push(t);
                    break;
                }
            }
        }
        return answer;
    }

    public int teacher(int n, int[][]board, int m, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int pos : moves) {
            for (int i = 0; i < n; i++) {
                if (board[i][pos - 1] != 0) {
                    int tmp = board[i][pos - 1];
                    board[i][pos - 1] = 0;
                    if (!stack.isEmpty() && tmp == stack.peek()) {
                        answer += 2;
                        stack.pop();
                    }
                    else stack.push(tmp);
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution3 s = new Solution3();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = in.nextInt();
            }
        }
        int m = in.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) {
            moves[i] = in.nextInt();
        }
        System.out.println(s.review1(n, board, m, moves));
    }

    public int review1(int n, int[][] board, int m, int[] moves) {
        int answer = 0;
        Stack<Integer> st = new Stack<>();
        // 4 3 1 1 3 2 4
        for (int i = 0; i < m; i++) {
            int x = moves[i] - 1;
            for (int j = 0; j < n; j++) {
                if (board[j][x] != 0) {
                    if (!st.isEmpty() && st.peek() == board[j][x]) {
                        st.pop();
                        answer += 2;
                    } else st.add(board[j][x]);
                    board[j][x] = 0;
                    break;
                }
            }
        }
        return answer;
    }
}
