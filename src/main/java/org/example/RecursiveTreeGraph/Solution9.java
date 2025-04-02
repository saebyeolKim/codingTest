package org.example.RecursiveTreeGraph;
import java.util.*;

public class Solution9 {
    Node root;
    public int BFS(Node root) {
        Queue<Node> Q = new LinkedList<>();
        Q.add(root);
        int L = 0;
        while(!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                Node cur = Q.poll();
                if (cur.lt == null && cur.rt == null) return L;
                if (cur.lt != null) Q.add(cur.lt);
                if (cur.rt != null) Q.add(cur.rt);
            }
            L++;
        }
        return 0;
    }

    public int DFS(int L, Node root) {
        if (root.lt == null && root.rt == null) return L;
        else return Math.min(DFS(L + 1, root.lt), DFS(L + 1, root.rt));
    }

    public static void main(String[] args) {
        Solution9 tree = new Solution9();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
//        tree.root.rt.lt = new Node(6);
//        tree.root.rt.rt = new Node(7);
//        tree.root.rt.rt.lt = new Node(8);
//        tree.root.rt.rt.rt = new Node(9);
        System.out.println(tree.reviewDFS(0, tree.root));
        System.out.println(tree.BFS(tree.root));
    }

    //최단거리는 BFS (Queue 사용) 로 풀어야 함
    //하지만 이번엔 DFS 활용
    public int reviewDFS(int L, Node root) {
        if (root.lt == null && root.rt == null) return L;
        else return Math.min(reviewDFS(L + 1, root.lt), reviewDFS(L + 1, root.rt)); //자식이 하나만 있을 때는 오류가 나서, BFS 로 해야됨
    }
}
