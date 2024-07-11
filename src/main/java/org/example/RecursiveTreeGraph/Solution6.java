package org.example.RecursiveTreeGraph;

public class Solution6 {
    static int n;
    static int[] ch; //static method 가 접근해야되기 때문에 static

    public void DFS(int L) {
        if (L == n + 1) {
            String tmp = "";
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 1) tmp += i + " ";
            }
            if (tmp.length() > 0) System.out.println(tmp);
        } else {
            ch[L] = 1; //사용한다
            DFS(L + 1); //왼쪽
            ch[L] = 0; //사용하지 않는다
            DFS(L + 1); //오른쪽
        }
    }

    public static void main(String[] args) {
        Solution6 T = new Solution6();
        n = 3;
        ch = new int[n + 1];
        T.DFS(1);
    }
}
