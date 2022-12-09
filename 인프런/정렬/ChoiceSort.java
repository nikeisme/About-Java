package org.example;

import java.util.*;
class Main {
    public int[] solution( int n, int[] arr) {

        // 배열의 길이만큼 비교
        for(int i=0; i<n-1; i++){
            int idx =i;

                // 뒤의 숫자와 비교
                for(int j=0; j<n; j++){

                    // 뒤의 숫자가 더 작으면 idx 처리
                    if(arr[j]<arr[idx]) idx=j;
                }
                int tmp = arr[i];
                // i번째에 작은 뒤의 숫자로 옮겨줌
                arr[i] = arr[idx];
                arr[idx]=tmp;
        }
        return arr;

    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i]=kb.nextInt();
        for(int x : T.solution(n, arr)) System.out.println(x);
    }
}