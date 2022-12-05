package org.example;

import java.util.*;

public class Main {

    public String solution(String str) {

        String answer = " ";

        /*toCharArray() : string을 기반으로 한 문자 배열 생성*/
        for (char x: str.toCharArray()) {

            /* 소문자이면, 대문자로 변환 */
            if(Character.isLowerCase(x)) answer+=Character.toUpperCase(x);

            /* 그 밖에는, 소문자로 변환 */
            else answer+=Character.toLowerCase(x);
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