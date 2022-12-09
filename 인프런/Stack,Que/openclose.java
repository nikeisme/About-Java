package org.example;

import java.util.*;
class Main {
    public String solution( String s){

        // answer 객체 생성
        String answer = "YES";

        // stack 객체 생성
        Stack<Character>stack=new Stack<>();

        // '(' 찾기
        for(char x: s.toCharArray()) {

            // '(' 이면 stack에 넣기
            if (x == '(') stack.push(x);
            else {
                // ')' 이면
                // stack이 비어있으면 짝이 존재하지 않는다
                if (stack.isEmpty()) return "NO";
                // 안 비어있으면 꺼낸다.
                stack.pop();
            }
        }

        // 짝을 다 이뤘는데도 비어있지 않으면 NO
        if(!stack.isEmpty()) return "NO";

        return answer;

    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}