package org.example;

import java.util.*;

public class Main {
    public String solution(String str){
        String answer = "";
        for(int i=0; i<str.length(); i++) {
            //System.out.println(str.charAt(i)+" "+ i + " " + str.indexOf(str.charAt(i)));
            if(str.indexOf(str.charAt(i))== i) answer += str.charAt(i);
        }

        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }

}