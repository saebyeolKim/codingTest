package org.example.StackQueue;
import java.util.*;

class Person {
    int id;
    int priority;
    public Person(int id, int priority) {
        this.id=id;
        this.priority=priority;
    }
}

public class Solution8 {
    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        //arr 을 돌면서 큐에 넣는다.
        //큐를 돈다.
        //큐를 돌면서 첫번째 값을 가지고 있다가
        //두번째 값과 비교해서 첫번째 값이 크면 그대로 가지고 있고, 두번째 값이 크면 두번째 값으로 바꾸고, 첫번째 값을 큐에 넣어준다

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < m; i++) q.offer(arr[i]);
        //0 50 60
        //max = 70
        while (q.size() > 0) {
            int max = 0;
            for (int i = 0; i < q.size(); i++) {
                if (max < q.peek()) {
                    int tmp = max;
                    max = q.poll();
                    q.offer(tmp);
                } else q.offer(q.poll());
                if (i == q.size() - 1) {
                    if (max == arr[m]) return ++answer;
                    else ++answer;
                }
            }
        }
        return answer;
    }

    public int teacher(int n, int m, int[] arr) {
        int answer = 0;
        Queue<Person> Q = new LinkedList<>();
        for (int i = 0; i < n; i++) Q.offer(new Person(i, arr[i]));
        while (!Q.isEmpty()) {
            Person tmp = Q.poll();
            for (Person x : Q) {
                if (x.priority > tmp.priority) {
                    Q.offer(tmp);
                    tmp = null;
                    break;
                }
            }
            if (tmp != null) {
                answer++;
                if (tmp.id == m) return answer;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution8 s = new Solution8();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(s.solution(n, m, arr));
    }
}
