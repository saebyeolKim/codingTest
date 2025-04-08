package org.example.RecursiveTreeGraph;

import java.util.LinkedList;
import java.util.Queue;

public class Solution10 {
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

    public static void main(String[] args) {
        Solution10 tree = new Solution10();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
//        tree.root.rt.lt = new Node(6);
//        tree.root.rt.rt = new Node(7);
//        tree.root.rt.rt.lt = new Node(8);
//        tree.root.rt.rt.rt = new Node(9);
        System.out.println(tree.reviewBFS(tree.root));
    }

    //최단거리는 BFS (Queue 사용) 로 풀어야 함
    public int reviewBFS(Node root) {
        Queue<Node> Q = new LinkedList<>();
        Q.add(root);
        int L = 0;
        while (!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                Node poll = Q.poll();
                if (poll.lt == null && poll.rt == null) return L;
                if (poll.lt != null) Q.add(poll.lt);
                if (poll.rt != null) Q.add(poll.rt);
            }
            L++;
        }
        return 0;
    }
}
