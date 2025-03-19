package org.example.RecursiveTreeGraph;


//root 부터 왼쪽으로 쭉쭉쭉 가다가 막히면 뒤로 백하기
//root 로 돌아오면 끝내기
//노드모양
//------------
//|   data   |
//|----------|
//| lt | rt  |
//------------
class Node {
    int data; //1 2 3 4 5 6 7
    Node lt, rt; //Node 객체의 주소를 저장하는 것
    public Node(int val) {
        data = val;
        lt = rt = null;
    }
}

public class Solution5 {
    Node root;
    public void DFS(Node root) {
        if (root == null) return; //말단노드
        else {
//            System.out.print(root.data + " "); //전위순회 (부 -> 왼 -> 오)
            DFS(root.lt); //왼쪽 노드부터
            System.out.print(root.data + " "); //중위순회 (왼 -> 부 -> 오)
            DFS(root.rt); //오른쪽 노드
//            System.out.print(root.data + " "); //후위순회 (왼 -> 오 -> 부)
        }
    }
    public static void main(String[] args) {
        Solution5 tree = new Solution5();
        //트리구조 그리기
        tree.root = new Node(1); //data = 1
        tree.root.lt = new Node(2); //data = 1 의 lt 에 new Node(2) 의 주소가 담김
        tree.root.rt = new Node(3); //data = 1 의 rt 에 new Node(3) 의 주소가 담긴
        tree.root.lt.lt = new Node(4); //data = 4 / lt,rt = null (말단노드이기 때문에 null)
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        //트리 순회하기
        tree.DFS(tree.root); //1번 노드 넘기기 (루트노드)
    }
}
