package org.example;

import java.util.*;
class Main {
    public ArrayList<Integer> solution(int n, int[] arr){

        /* 빈 배열 생성 */
        ArrayList<Integer> answer = new ArrayList<>();
        
        /* 제일 첫번째 수 삽입 */
        answer.add(arr[0]);

        /* 앞의 숫자와 비교 */
        for (int i=1; i<n; i++){
            if(arr[i]>arr[i-1]) answer.add(arr[i]);
        }
        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = kb.nextInt();
        }
        for(int x: T.solution(n,arr)){
            System.out.println(x);
        }
    }
}