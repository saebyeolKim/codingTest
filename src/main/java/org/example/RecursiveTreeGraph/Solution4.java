package org.example.RecursiveTreeGraph;

public class Solution4 {
    static int[] fibo;
    public int DFS(int n) {
        //이미 배열에 값이 있으면 그 값을 return 해준다. (메모이제이션)
        if (fibo[n] > 0) return fibo[n];
        //배열에 값을 담아서 배열값을 불러온다. 그러면 시간이 절약된다.
        if (n == 1 || n == 2) return fibo[n] = 1;
        else {
            return fibo[n] = DFS(n - 2) + DFS(n - 1);
        }
    }
    public static void main1(String[] args) {
        Solution4 T = new Solution4();
        int n = 45;
        fibo = new int[n + 1];
        T.DFS(n);
        for (int i = 1; i <= n; i++) System.out.println(fibo[i] + " ");
    }

    public static void mainReview1(String[] args) {
        Solution4 T = new Solution4();
        int n = 7;
        System.out.println(T.review1(n));
    }

    //n번째 항을 구함
    public int review1(int n) {
        if (n == 1) return 1;
        else if (n == 2) return 1;
        else return review1(n - 2) + review1(n - 1);
        //D(5) -> D(3) + D(4) = 2 + 3 = 5
        //D(3) -> D(1) + D(2) = 1 + 1 = 2
        //D(4) -> D(2) + D(3) = 1 + 2 = 3
    }
    static int[] fb;
    public static void main(String[] args) {
        Solution4 T = new Solution4();
        int n = 45;
        //이렇게 짤 수 있지만, 시간이 오래 걸림
//        for (int i = 1; i <= n; i++) System.out.print(T.review1(i) + " ");
        //이렇게 짜야함
        fb = new int[n + 1]; //0번 인덱스 사용안함
        T.review1_2(n);
        for (int i = 1; i <= n; i++) System.out.print(fb[i] + " ");
    }

    //이것도 좀 오래걸림
    public int review1_1(int n) {
        if (n == 1) return fb[n] = 1;
        else if (n == 2) return fb[n] = 1;
        else return fb[n] = review1_1(n - 2) + review1_1(n - 1);
    }

    //이미 구해 놓은 값이 있는 지 확인해서 있으면 넘어가기
    //금방 나옴!
    public int review1_2(int n) {
        if (fb[n] != 0) return fb[n];
        if (n == 1) return fb[n] = 1;
        else if (n == 2) return fb[n] = 1;
        else return fb[n] = review1_2(n - 2) + review1_2(n - 1);
    }
}
