package org.example;

import java.util.*;

public class Main {
    public String solution(String str){
        String answer="";

        int m = Integer.MIN_VALUE,pos;

        /* indexOf는 원하는 index가 없으면 -1로 출력 */
        while((pos=str.indexOf(' '))!=-1){
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if(len > m){
                m=len;
                answer =tmp;
            }
            str = str.substring(pos + 1);
        }
        /* 마지막 단어 study를 위한 코드 */
        if(str.length()>m) answer=str;
        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str=kb.nextLine();
        System.out.print(T.solution(str));
    }

}