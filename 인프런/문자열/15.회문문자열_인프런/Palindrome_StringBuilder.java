package org.example;

import java.util.*;

public class Main {
    public String solution(String str){
        String answer = "No";
        String tmp = new StringBuilder(str).reverse().toString();
        // 문자열 비교 : 대소문자 구별없이
        if (str.equalsIgnoreCase(tmp)) answer="Yes";
        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }

}