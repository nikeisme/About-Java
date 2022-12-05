package org.example;

import java.util.*;

public class Main {

    public String solution(String str) {

        String answer = " ";

        /*toCharArray() : string을 기반으로 한 문자 배열 생성*/
        /* 아스키 넘버 : 대문자(65~90), 소문자(97~122) */
        for (char x: str.toCharArray()) {
            //if( x>=97 && x<=122) System.out.print(x); // tu출력
            if( x>=97 && x<=122) answer +=(char)(x-32);
            else answer+=(char)(x+32);
        }
        return answer;
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));

    }
}