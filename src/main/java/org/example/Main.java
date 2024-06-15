package org.example;

import org.example.String.Solution2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input1 = in.next();
        Solution2 s = new Solution2();
        System.out.println(s.solution(input1));
    }
}