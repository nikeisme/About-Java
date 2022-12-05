package org.example;

import java.util.*;

public class Main {
    public int solution(String s){
        String answer = "";
        for (char x: s.toCharArray()) {
            if(Character.isDigit(x)) answer +=x;
        }
        return Integer.parseInt(answer);
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }

}