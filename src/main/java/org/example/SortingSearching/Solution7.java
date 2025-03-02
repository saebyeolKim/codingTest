package org.example.SortingSearching;

import java.util.*;

class Point implements Comparable<Point> {
    public int x, y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if (this.x == o.x) return this.y - o.y;
        else return this.x - o.x;
    }
}

public class Solution7 {
    public int[][] solution(int n, int[][] arr) {
        for (int i = 0 ; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j][0] > arr[j + 1][0]) {
                    int xTmp = arr[j][0];
                    arr[j][0] = arr[j + 1][0];
                    arr[j + 1][0] = xTmp;
                    int yTmp = arr[j][1];
                    arr[j][1] = arr[j + 1][1];
                    arr[j + 1][1] = yTmp;
                } else if (arr[j][0] == arr[j + 1][0]) {
                    if (arr[j][1] > arr[j + 1][1]) {
                        int yTmp = arr[j][1];
                        arr[j][1] = arr[j + 1][1];
                        arr[j + 1][1] = yTmp;
                    }
                }
            }
        }
        return arr;
    }

    public static void main2(String[] args) {
        Solution7 s = new Solution7();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        for (int[] x : s.solution(n, arr)) {
            System.out.println(x[0] + " " + x[1]);
        }
    }

    public static void main3(String[] args) {
        Solution7 s = new Solution7();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Point> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            arr.add(new Point(x, y));
        }
        Collections.sort(arr);
        for (Point o : arr) {
            System.out.println(o.x + " " + o.y);
        }
    }

    public static void main(String[] args) {
        Solution7 s = new Solution7();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[2][5];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                arr[j][i] = in.nextInt();
            }
        }
        review1(n, arr);
    }

    public static void review1(int n, int[][] arr) {
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0) x[j] = arr[i][j];
                else y[j] = arr[i][j];
            }
        }
        Arrays.sort(x);
        Arrays.sort(y);
        for (int i = 0; i < n; i++) {
            System.out.print(x[i] + " " + y[i]);
            if (i < n - 1) System.out.println();
        }
    }
}
