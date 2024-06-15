package org.example;

import org.example.String.Solution1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input1 = in.next();
        String input2 = in.next();
        char c = input2.charAt(0);
        Solution1 s = new Solution1();
        System.out.println(s.correct(input1, c));
    }
}