package org.example;

import java.util.*;
class Main {
    public char solution(int n, String s){
        char answer= ' ';

        /* HashMap 생성*/
        HashMap<Character,Integer> map = new HashMap<>();

        /* key: 문자, value: 개수로 put */
        for(char x : s.toCharArray()){
            map.put(x,map.getOrDefault(x,0)+1);
        }
//        System.out.print(map);

        /* 개수 비교해서 큰 수 값 출력하기*/
        int max = Integer.MIN_VALUE;
        for(char key : map.keySet()){
            if(map.get(key)>max){
                max = map.get(key);
                answer = key;
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n= kb.nextInt();
        String str = kb.next();
        System.out.println(T.solution(n,str));
    }
}