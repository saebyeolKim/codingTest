package org.example.RecursiveTreeGraph;

public class Solution6 {
    static int n; //집합 원소의 개수
    static int[] ch; //check 배열 부분집합으로 사용한다, 안한다. static method 가 접근해야되기 때문에 static
    // ch [1, 1, 1] 0번 인덱스는 버린다.
    //|
    //|
    //| D(4) - 10line -> pop()|
    //| D(3) - 10line -> 12line -> pop() -> D(3) - 10line -> |
    //| D(2) - 10line -> 12line |
    //| D(1) - 10line |
    public void DFS(int L) {
        if (L == n + 1) { // 종료지점
            String tmp = "";
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 1) tmp += i + " "; //1로 체크되어있는 부분집합을 출력한다.
            }
            if (tmp.length() > 0) System.out.println(tmp);
        } else {
            ch[L] = 1; //사용한다. 체크 인덱스를 1로 바꿈
            DFS(L + 1); //왼쪽으로 뻗는다.
            ch[L] = 0; //사용하지 않는다. 체크 인덱스를 0으로 바꿈
            DFS(L + 1); //오른쪽으로 뻗는다.
        }
    }

    public static void main(String[] args) {
        Solution6 T = new Solution6();
        n = 3;
        ch = new int[n + 1];
        T.DFS(1);
    }
}
