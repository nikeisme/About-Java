package MultiArrEx2;// 빙고

import java.util.Scanner;

public class MultiArrEx3 {

    public static void main(String[] args) {

        int[][] m1 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] m2 = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        final int ROW = m1.length; // m1의 행 길이
        final int COL = m2[0].length; // m2의 열 길이
        final int M2_ROW = m2.length; // m2의 행 길이

        int[][] m3 = new int[ROW][COL];

        // 행렬 곱 m1 X m2의 결과를 m3에 저장
        // m1의 열의 길이와 m2의 행의 길이가 같아야 한다.
        // m1이 2행 3열이고, m2가 3행 2열이므로 조건에 부합
        for (int i = 0; i < ROW; i++)
            for (int j = 0; j < COL; j++)
                for (int k = 0; k < M2_ROW; k++) {
                    m3[i][j] += m1[i][k] * m2[k][j];
                }

        // 행렬 m3를 출력
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                System.out.printf("%3d", m3[i][j]);
            }
            System.out.println();
        }
    }
}