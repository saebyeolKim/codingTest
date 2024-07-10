package org.example.RecursiveTreeGraph;

class Node {
    int data;
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
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.DFS(tree.root);

    }
}
