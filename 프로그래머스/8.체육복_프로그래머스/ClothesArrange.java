import java.util.HashSet;

public class ClothesArrange {
    public int solution(int n, int[] lost, int[] reverse) {
        // 1. student 배열 생성

        int[] student = new int[n+2];
        int answer = 0;

        // 2. reverse / lost 정보 반영
        for ( int l : lost )
            student[l]--;
        for (int r : reverse)
            student[r]++;

        // 3. 여분을 기준으로 앞뒤를 확인
        for ( int i=1; i<=n; i++){
            if(student[i]==1){
                if(student[i-1]==-1){
                    student[i]--;
                    student[i-1]++;
                }
                else if(student[i+1]==-1){
                    student[i] --;
                    student[i+1] ++;
                }
            }
        }

        // 4. 체육복을 갖고 있는 학생 수를 계산

        for(int i = 1; i<=n;i++)
            if(student[i]>=0)
                answer++;

        return answer;

    }

    public static void main(String[] args) {
        ClothesArrange sol = new ClothesArrange();
        int[] lost = { 2, 4 };
        int[] reserve = { 1, 3, 5 };
        System.out.print(sol.solution(5, lost, reserve));
    }

}
