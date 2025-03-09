package org.example.RecursiveTreeGraph;

import java.util.*;

public class Solution1 {
    public void DFS(int n) {
        if (n == 0) return;
        else {
//            System.out.print(n + " "); 3 2 1
            DFS(n - 1);
            System.out.print(n + " "); //1 2 3 : 재귀함수는 스택 프레임을 사용
        }
    }
    public static void main(String[] args) {
        Solution1 T = new Solution1();
        T.review1(3);
    }

    //재귀함수 : 자기가 자기 자신을 호출 하는 함수 (DFS : 깊이 우선 탐색)
    //자연수 N이 입력되면 재귀함수를 이용하여 1부터 N 까지를 출력하는 프로그램을 작성하세요.
    //재귀함수는 스택프레임을 사용한다.
    //함수 호출 시
    //매개변수, 지역변수,복귀주소의 정보를 가지고 있는 프레임이 저장된다.
    //| 프레임0 DFS(0)          |
    //| 프레임1 DFS(1) -- line6 |
    //| 프레인2 DFS(2) -- line6 |
    //| 프레임3 DFS(3) -- line6 |
    // ￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣
    //DFS(3) 은 DFS(2)을 만나 대기상태로 들어간다.
    //DFS(2) 도 DFS(1)을 만나 대기상태로 들어간다.
    //DFS(1) 도 DFS(0)을 만나 내기상태로 들어간다.
    //if 에 걸려 종료되는 순간 POP 이 실행된다. (백트래킹) DFS(0) -> DFS(1) -> DFS(2) -> DFS(3)
    //DFS 함수를 다 실행한 뒤에 print 하기 때문에 함수 밑에 있으면 스택프레임에 저장된게 pop 된다.
    //정답 : 1 2 3
    public void review1(int n) {
        if (n == 0) return;
        else {
            System.out.print(n + " "); //3 2 1
            review1(n - 1);
            System.out.print(n + " "); //1 2 3
        }

    }
}
