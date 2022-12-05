package org.example;

import java.util.*;

public class Main {
    public ArrayList<String> solution(int n, String[] str){
        ArrayList<String> answer = new ArrayList<>();
        for (String x: str) {

            /* String Builder 문자열 객체, 역접, String으로 바꿈 */
            /* String Builder를 String 타입으로 써야할 때, toString() 꼭 써야 함*/
            String tmp = new StringBuilder(x).reverse().toString();

            /*answer의 타입은 ArrayList이므로 add 메서드 */
            answer.add(tmp);
        }

        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] str=new String[n];
        for(int i=0; i<n; i++){
            str[i]=kb.next();
        }
        for (String x: T.solution(n,str)) {
            System.out.println(x);
        }
    }

}