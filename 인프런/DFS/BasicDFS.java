package org.example;

import java.util.*;
class Main {
    public void DFS( int n) {

        if(n==0) return;
            DFS(n - 1);
        System.out.print( n+"  ");
        }

    public static void main(String[] args){
        Main T = new Main();
        T.DFS(3);
    }
}