package org.example.RecursiveTreeGraph;

public class Solution3 {
    public int DFS(int n) {
        if (n == 1) return 1;
        else return n * DFS(n - 1);
    }
    public static void main(String[] args) {
        Solution3 T = new Solution3();
        System.out.println(T.review1(5));
    }

    public int review1(int n) {
        if (n == 1) return 1;
        else return n * review1(n - 1);
        //D(5) 5 * D(4)
        //D(4)     4 * D(3)
        //D(3)         3 * D(2)
        //D(2)             2 * D(1)
        //D(1)                 1    위로 올라간다.
        //1 * 2 * 3 * 4 * 5 백트래킹으로 이렇게 실행된다.
    }
}
